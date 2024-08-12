package treealgo;
import java.util.*;

class TreeData {
    int value;
    TreeData left;
    TreeData right;

    TreeData(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}
public class TreenNodeDatas {
	 public TreeData buildTree(Integer[] values) {
	        if (values.length == 0 || values[0] == null) {
	            return null;
	        }
	        
	        TreeData root = new TreeData(values[0]);
	        Queue<TreeData> queue = new LinkedList<TreeData>();
	        queue.add(root);
	        int index = 1;
	        
	        while (index < values.length) {
	     
	        	TreeData current = queue.poll();
	            
	            if (values[index] != null) {
	                current.left = new TreeData(values[index]);
	                queue.add(current.left);
	            }
	            index++;
	            
	            if (index < values.length && values[index] != null) {
	                current.right = new TreeData(values[index]);
	                queue.add(current.right);
	            }
	            index++;
	        }
	        
	        return root;
	    }
	 public static void main(String[] args) {
		 Integer[] userInput = {1,2,3,null,4,null,5};
	        
		 TreenNodeDatas binaryTree = new TreenNodeDatas();
		 TreeData   root = binaryTree.buildTree(userInput);
		 
		 boolean data = binaryTree.getbuildparentchildrelation(root,5,4);
		 System.out.println("===="+data);
	 }
	private boolean getbuildparentchildrelation(TreeData root,int x,int y) {
		
		  if(root == null) return false;
	        Queue<TreeData> queue = new LinkedList<TreeData>();
	        queue.offer(root);
	        int childCount =0;
	        while(!queue.isEmpty()){
	           
	            for(int i =0;i<=queue.size();i++){
	            	TreeData node1 = queue.poll();
	                  int sameParentCount =0;
	            
	                   if(node1.left!=null){
	                	  
	                    if(node1.left.value==x || node1.left.value==y){
	                    		sameParentCount++;
	                    		childCount++;
	                    }
	                    queue.offer(node1.left);
	                   }
	                    if(node1.right!=null){
	                    if(node1.right.value==x || node1.right.value==y){
	                    
	                        sameParentCount++;
	                        childCount++;
	                    }
	                    queue.offer(node1.right);
	                   }
	                   if(sameParentCount==2){
	                    return false;
	                   }

	            }
	            if(childCount==2){
	                return true;
	            }
	             if(childCount==1){
	                return false;
	            }


	        }
	        return false;
	}

}
