package tested;

import java.util.Arrays;
import java.util.stream.Stream;

public class arrayadd {
	public static void main(String[] args) {
		  int[] a = new int[] { 1, 2, 3};
	        int[] b = new int[] { 3, 4, 5};
	        int[] r = new int[a.length + b.length];
	        
	      
	       for(int i =0; i < a.length;i++) {
	    	   r[i] = a[i];
	       }
	       for(int i =0; i < b.length;i++) {
	    	   r[a.length+i] = b[i];
	       }
	       for(int i =0 ;i<r.length;i++) {
	    	   System.out.println(r[i]);
	       }
		
	}

}
