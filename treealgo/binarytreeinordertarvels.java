package treealgo;
import java.util.*;
// inorder travels (left root right) 
public class binarytreeinordertarvels {
	
	public static void main(String[] args) {
		Integer[] t = {1,null,2,3,4};
		TreeData root = binarytree(t);
		List<Integer> datas = inorderTravels(root);
		System.out.println("datas"+datas);
	}                                                                                                                                    

	private static List<Integer> inorderTravels(TreeData root) {
		List<Integer> t = new ArrayList<>();
		Queue<TreeData> t1 = new LinkedList<TreeData>();
		t1.add(root);

		return t;
	}

	private static TreeData binarytree(Integer[] t) {
		
		if(t.length==0 && t[0]==null) {
			return null;
		}
		Queue<TreeData> data = new LinkedList<TreeData>();
		TreeData root = new TreeData(t[0]);
		data.add(root);
		
		
		int index=1;
		while(index<t.length) {
			TreeData current = data.poll();
			if(t[index]!=null) {
				current.left = new TreeData(t[index]);
				data.add(current.left);
				
			}
			index++;
			if(t[index]!=null) {
				current.right = new TreeData(t[index]);
				data.add(current.right);
			}
			index++;
			
		}
		return root;
	}
	
	

}
