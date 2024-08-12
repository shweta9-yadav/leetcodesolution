package stringarray;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stringcount {
	public static void main(String[] args) {
		String s ="aaaauyyy";
		String[] s1 =s.split("");
	
		HashMap<String, Integer> t = new HashMap<>();

		for(String s2:s1) {
			if(t.keySet().contains(s2)) {
				
				t.put(s2, t.get(s2)+1);
			}
			else {
				t.put(s2,1);
			}
	
		}
		
		  t.forEach((key, value) -> {
	            System.out.println("Key: " + key + ", Value: " + value);
	        });
		
	}

}
