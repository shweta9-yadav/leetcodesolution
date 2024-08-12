package tested;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class interleavingstring {
	public static void main(String[] args) {
	
	int n=5;
	Integer n1 =n;
	int n2=0;
	
	for(int i=n-1;i>0;i--) {
		n1=n1*i;
		
	}
	System.out.println(n1);
	String a= n1.toString();
	System.out.println(a);
	ArrayList<Character> test = new ArrayList<>();
	for(int i=0;i<a.length();i++) {
		test.add(a.charAt(i));
		
	}
	List<Integer> intList = test.stream()
            .map(c -> Character.getNumericValue(c))  
            .collect(Collectors.toList());

	System.out.println(intList);
	

}
}
