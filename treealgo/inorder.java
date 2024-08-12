package treealgo;
import java.util.*;
//inorder(left root right)


class Nodess{
	int data;
	Nodess left,right;
	Nodess(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
public class inorder {
	private Nodess binarytree(Integer[] a) {
		if(a.length ==0 || a[0]==null) {
			return null;
		}
		Nodess root = new Nodess(a[0]);
		Queue<Nodess> data = new LinkedList<Nodess>();
		data.add(root);
		int index=1;
		
		while(index<a.length) {
			Nodess current = data.poll();
			if(a[index] != null) {
				current.left = new Nodess(a[index]);
				data.add(current.left);
			}
			index++;
			if(a[index] != null) {
				current.right = new Nodess(a[index]);
				data.add(current.right);
			}
			
		}
		
		
		return root;
	}
	
	public static void main(String[] args) {
		inorder p = new inorder();
		Integer[] a = {1,2,3,4,5,6,7};
		Nodess root = p.binarytree(a);
		p.getinorder(root);
	}

	

	private List<Integer> getinorder(Nodess node) {
		List<Integer> datas = new ArrayList<>();
		Stack<Nodess> s = new Stack<Nodess>();
		Nodess node1 = node;
		while(true) {
			if(node1!=null)
			{
				s.push(node1);
				node1.left= node1;
			}
			else {
				if(s.isEmpty()) {
					break;
				}
				node1= s.pop();
				datas.add(node1.data);
				node1=node1.right;
			}
			//datas.add(s);
			
		}
		return datas;
		
		// TODO Auto-generated method stub
		
	}

}
