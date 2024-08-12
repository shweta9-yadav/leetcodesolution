package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class starpatterns {
	public static void main(String[] args) {
		String s = "ilove{java}data";
		
		Pattern p = Pattern.compile("java");
		Matcher m = p.matcher(s);
		if(m.find()) {
			System.err.println(m.group(0));
			System.out.println("Pattern found at index: " + m.start());
			}
		}
		

}
