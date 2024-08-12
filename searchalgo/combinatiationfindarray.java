package searchalgo;
import java.util.*;
public class combinatiationfindarray {
	public static void main(String[] args) {
		int[] a = {1,3};
		int target =6;
		
		HashMap<Integer, String> t = new HashMap<>();
		int count=0;
		int count1=0;
		List<String> s1 = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				String s= a[i]+","+a[j];
				t.put(j,s);
			}
		}
		
		 t.forEach((key, value) -> {
	            System.out.println("Key: " + key + ", Value: " +value);
	          int c=get1(value);
	          if(c<target) {
	        	  int te = target-c;
	          }
	          
	        });
		 
		
	}

	public static int get1(String value) {
		Integer c =0;
		// TODO Auto-generated method stub
		String[] s2= value.split(",");
		for(int i=0;i<s2.length;i++) {
			System.out.println(s2[i]);
			
			c+=Integer.valueOf(s2[i]);
			
		}
		
		return c;
		
	}

}
