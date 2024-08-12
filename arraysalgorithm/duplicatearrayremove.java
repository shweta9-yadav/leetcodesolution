package arraysalgorithm;
import java.util.*;

public class duplicatearrayremove {
	public static void main(String[] args) {
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		double a=0;
		int temp=0;
		ArrayList<Integer> t = new ArrayList<Integer>();
		
		for(Integer t1:nums1) {
			t.add(t1);
		}
		for(Integer t1:nums2) {
			t.add(t1);
		}
		int n =t.size();
		Collections.sort(t);
        
        if (n % 2 == 1) {
        	System.out.println("--");
            a= t.get(n/2);
        } else {
        	System.out.println("---");
            a= (t.get(n/2-1)+t.get(n/2))/2.0;
        }
        System.out.println(a);
	}

}
