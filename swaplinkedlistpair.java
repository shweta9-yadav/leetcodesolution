class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) {
        val = x;
        next = null;
    }
}
public class swaplinkedlistpair {
	
	
	public static void main(String[] args) {
		swaplinkedlistpair solution = new swaplinkedlistpair();

	    
		ListNode1 head = new ListNode1(1);
	    head.next = new ListNode1(2);
	    head.next.next = new ListNode1(3);
	    head.next.next.next = new ListNode1(4);
	    
	    head.next.next.next.next = new ListNode1(5);
	    head.next.next.next.next.next = new ListNode1(6);

	  
	    ListNode1 newHead = solution.swapPairs(head);
//	    ListNode1 newHead1 = solution.swapPairs1(head);
	    while (newHead != null) {
	        System.out.print(newHead.val + " ");
	        newHead = newHead.next;
	    }
//	    while (newHead1 != null) {
//	        System.out.print(newHead1.val + " ");
//	        newHead1 = newHead1.next;
//	    }
	}

	private ListNode1 swapPairs(ListNode1 head) {
		
		ListNode1 dummy = new ListNode1(0);
        dummy.next = head;
        System.out.println("dummy.next"+dummy.next.val+"head"+head.val);
        ListNode1 prevNode = dummy;
        System.out.println("dummy"+dummy.val);

       
        while (head != null && head.next != null && head.next.next!=null) {
           
        	ListNode1 firstNode = head;
        	ListNode1 secondNode = head.next;
        	ListNode1 thirdNode = head.next.next;
        	 System.out.println("headnext"+head.next.val+"secondnodenext"+secondNode.next);
           
            prevNode.next = thirdNode;
            secondNode = thirdNode.next;
            firstNode.next = secondNode.next;
            firstNode = secondNode.next;
            secondNode.next = thirdNode.next;
            thirdNode.next = firstNode;

          
            prevNode = firstNode;
            head = firstNode.next;
        }
        System.out.println("---"+dummy.next.val);
      
        return dummy.next;

	}
//	public ListNode1 swapPairs1(ListNode1 head) {
//     
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode1 firstNode = head;
//        ListNode1 secondNode = head.next;
//        
//        firstNode.next = swapPairs(secondNode.next);
//        System.out.println("==="+firstNode.next.val); 
//        System.out.println("===+"+secondNode.next.val); 
//        System.out.println("===++"+firstNode.val); 
//       // secondNode.next = firstNode;
//        System.out.println("===++secondNode"+secondNode.val); 
//        return secondNode;
//    }
}
