
package stringarray;

public class pseudocodefind {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,10};
		int expected = 10*(10+1)/2;
		int sum =0;
		for(int b:a) {
		sum+=b;	
		}
		
		int c = expected-sum;
		System.out.println(c);
		
	}

}
