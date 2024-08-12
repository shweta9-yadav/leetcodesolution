package treealgo;

import java.util.*;

//inordertravel(left root right)
//preordertravel(root left right)
//postordertravel(left right root)

//bfs - levelwise
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(){}
	TreeNode(int data,TreeNode left,TreeNode right){
		this.data= data;
		this.left= left;
		this.right = right;
		
	}
}
class firsttree {
	//TreeNode root;
	public static void main(String[] args) {
		firsttree t = new firsttree();
		//t.root= new TreeNode(1, null, null);
		System.out.println(t.gettreedata(new TreeNode(1, null, null)));
	
	}
	private List<List<Integer>> gettreedata(TreeNode treeNode) {
		Queue<TreeNode> t = new LinkedList<>();
		List<List<Integer>> data = new ArrayList<>();
		
		if(treeNode == null) {
			return data;
		}
		t.offer(treeNode);//get data 
		while(!t.isEmpty()) {
			int siz= t.size();
			List<Integer> data1 = new ArrayList<>();
			for(int i =0;i<siz;i++) {
				if(t.peek().left!=null) t.offer(t.peek().left);
				if(t.peek().right!=null) t.offer(t.peek().right);
				data1.add(t.poll().data);
			}
			data.add(data1);
		}
		// TODO Auto-generated method stub
		return data;
		
	}
	
	

}
