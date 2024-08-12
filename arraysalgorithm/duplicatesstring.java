package arraysalgorithm;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class duplicatesstring {
	public static void main(String[] args) {
		
		
//		Set<Character> duplicate = new LinkedHashSet<>();
//		StringBuilder sb = new StringBuilder();
//		for(char c:a.toCharArray()) {
//			if(duplicate.add(c)) {
//			sb.append(c);
//			}
//		}
//		System.out.println(sb);
//		String a ="dffdjdfkhdfhjfd";
//		char charToRemove = 'd';
//        String result = removeCharacter(a, charToRemove);
//        System.out.println("---"+result);
		String a1= "i love {java} test";
		String a2 ="i";
		String str = "";
		Pattern p = Pattern.compile("\\{(.*?)\\}");
		Matcher m = p.matcher(a1);
		if(m.find()) {
			str = m.group(1);
		}
		System.out.println("str"+str);
		StringBuilder sb = new StringBuilder();
		for(char c : a1.toCharArray()) {
			if(a2.indexOf(c)==-1) {
				sb.append(c);
			}
		}
		System.out.println("sb"+sb);
		
	}
//	 public static String removeCharacter(String str, char ch) {
//	        if (str.isEmpty()) {
//	            return str;
//	        }
//	        System.out.println("str.charAt(0)======="+str);
//	        char firstChar = str.charAt(0);
//	        System.out.println("str.charAt(0)"+str.charAt(0));
//	        String remainingString = str.substring(1);
//	        System.out.println("str.charAt(q)"+str.substring(1));
//	        if (firstChar == ch) {
//	            return removeCharacter(remainingString, ch);
//	        } else {
//	            return firstChar + removeCharacter(remainingString, ch);
//	        }
	        

//}
}