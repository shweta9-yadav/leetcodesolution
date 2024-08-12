package stringarray;
import java.util.*;

public class distinctarray {
	public static void main(String[] args) {
		String[] arr1 = {"d","b","c","b","c","a"};
		int k =2;
		String s1 = "";
		 LinkedHashMap<String,Integer> data = new  LinkedHashMap<String,Integer>();
		ArrayList<String> list = new ArrayList<String>();
		for(String s2:arr1) {
			if(data.keySet().contains(s2)) {
				data.put(s2,data.get(s2)+1);
			}
			else {
				data.put(s2,1);
			}
			
		}
		  data.forEach((key, value) -> {
	            if (value == 1) {
	                list.add(key);
	            }
	        });
		  for(int i=0;i<list.size();i++) {
			  if(k-1==i) {
				  System.out.println(list.get(i));
			  }
		  }
		
		
		
	}

}
