package tested;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twosums {
	public static void main(String[] args) {
				
	HashMap<Integer,Integer> map = new HashMap<>();
	ArrayList<Integer> t1 = new ArrayList<>();
	int[] a = {1,2,3,4,5,6};
	int[] b = new int[a.length];
	int target =7;
	
//	for(int i=0;i<a.length;i++) {
//		int more = target-a[i];
//		if(map.containsKey(more)) {
//			System.out.println("Indices: " + map.get(more) + ", " + i);
//            return;
//		}
//		map.put(a[i], i);
//	}
//	System.out.println("----"+map);
	
	

   
    // Iterate through the array
    for (int i = 0; i < a.length; i++) {
        // Calculate the complement
        int complement = target - a[i];
       
       // System.out.println(complement);
        // Check if the complement exists in the map
        if (map.containsKey(complement)) {
            // If it exists, print the indices and return
            System.out.println("Indices: " + map.get(complement) + ", " + i);
            
            t1.add(map.get(complement));
            t1.add(i);
            System.out.println("---"+map+"===="+t1);
            return;
        }
        
        // If it doesn't exist, add the current number and its index to the map
        map.put(a[i], i);
        System.out.println("==="+t1);
       
    }
   
		
	}
	
	

}
