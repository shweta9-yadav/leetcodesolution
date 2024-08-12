import java.util.*;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class removelinkedlist {
	
	
	public static void main(String[] args) {
		Integer[] t = {1,2,3,4,5};
		ListNode root = binarytree(t);
		ListNode data = removedata(root);
		System.out.println(data);
		
	}

	private static ListNode removedata(ListNode root) {
		
		System.out.println(root.val);
		System.out.println(root.next.val);
		
		return null;
	                              }

	private static ListNode binarytree(Integer[] t) {
		Queue<ListNode> queue = new LinkedList<ListNode>();
		
		if(t.length==0 && t[0]==null) {
			return null;
		}
		ListNode root = new ListNode(t[0]);
		queue.add(root);
		int index=1;
		while(index<t.length) {
			ListNode current = queue.poll();
			if(t[index]!=null) {
				current.next = new ListNode(t[index]);
				queue.add(current.next);
			}
			index++;
		}
		// TODO Auto-generated method stub
		return root;
	}

}
