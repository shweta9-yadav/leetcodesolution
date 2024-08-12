package tested;

import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testforstring {
	public static void main(String[] args) {
		String s="qqqqqqqq";
		String[] s1 = s.split("");
//		HashMap<String, Integer> t = new HashMap<>();
//		for(String s2:s1) {
//			if(t.containsKey(s2)) {
//				t.put(s2, t.get(s2)+1);
//			}
//			else {
//				t.put(s2, 1);
//			}
//		}
//		t.forEach((key,value)->{
//			System.out.println(key+"-"+value);
//		});
		
		String s2 = "i love {java} test";
		
		String str="love";
		StringBuilder sb = new StringBuilder();
		for(char s3:s2.toCharArray()) {
			if(str.indexOf(s3)==-1) {
				sb.append(s3);
			}
//			
		
		StringBuilder sb1 = new StringBuilder();
		HashSet<Character> seen = new HashSet<>();
		for(char c : s2.toCharArray()) {
			if(!seen.contains(c)) {
				seen.add(c);
				sb1.append(c);
			}
		}
		System.out.println(sb1);
		}
		
//		Pattern p = Pattern.compile("\\{(.*?)\\}");
//		Matcher m = p.matcher(s);
//		if(m.find()){
//			str= m.group(1);
//		}
	}

}
