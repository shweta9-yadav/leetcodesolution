package arraysalgorithm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class hashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> t = new HashMap<>();
		t.put("shweta", 1);
		t.put("bushra", 2);
		t.put("Aditi", 3);
		Set<Entry<String, Integer>> entrySet = t.entrySet();
		 List<Map.Entry<String, Integer>> entryList = new ArrayList<>(t.entrySet());

	        // Sort the list by values (ascending order)
	        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
	            @Override
	            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
	                return e1.getValue().compareTo(e2.getValue());
	            }
	        });

	        // Display sorted entries
	        for (Map.Entry<String, Integer> entry : entryList) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	        
	        
//	        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
//	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//	        }
	        
	        
//	        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
//	        while (iterator.hasNext()) {
//	            Map.Entry<String, Integer> entry = iterator.next();
//	            // Perform some logic
//	            if (/* some condition */) {
//	                iterator.remove(); // Safe removal during iteration
//	            }
//	        }

	}

}
