package treealgo;
import java.util.*;
// preorder(root left right) -- stack
class Node{
	int data;
	Node left,right;
	Node(){}
	Node(int data,Node left,Node right){
		this.data = data;
		this.right = right;
		this.left = left;
		
		
	}
}
public class preorder {
	public static void main(String[] args) {
		preorder p = new preorder();
		p.getpreorder(new Node(1, null,null));
		
	}

	private List<Integer> getpreorder(Node node) {
		List<Integer> data = new ArrayList<>();
		Stack<Node> s = new Stack<Node>();
		if(node==null) return data;
		s.push(node);
		while(!s.isEmpty()) {
			node = s.pop();
			data.add(node.data);
			if(node.left!=null)
				s.push(node.left);
			if(node.right!= null)
				s.push(node.right);
			
		}
		return data;
		// TODO Auto-generated method stub
		
	}

}
