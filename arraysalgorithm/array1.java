package arraysalgorithm;

import java.util.HashMap;

public class array1 {
	public static void main(String[] args) {
		String s ="ahdjjdjdjd";
		String[] s1 = s.split("");
		HashMap<String, Integer> data = new HashMap<String, Integer>();
		for(String s2:s1) {
			if(data.keySet().contains(s2)) {
				data.put(s2, data.get(s2)+1);
			}
			else {
				data.put(s2, 1);
			}
		}
	}

}
