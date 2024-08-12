package treealgo;
import java.util.*;

class TreeNodes1{
	int data;
	TreeNodes1 left;
	TreeNodes1 right;
	TreeNodes1(){}
	TreeNodes1(int data,TreeNodes1 left,TreeNodes1 right){
		this.data= data;
		this.left= left;
		this.right = right;
		
	}
}
public class postorder {
	public static void main(String[] args) {
		postorder p= new postorder();
		p.getpostorder(new TreeNodes1(1,null,null));
	}

	private List<Integer> getpostorder(TreeNodes1 treeNode) {
		List<Integer> datas = new ArrayList<>();
		
		return datas;
		// TODO Auto-generated method stub
		
	}

}
