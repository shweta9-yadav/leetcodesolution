package tested;
import java.util.*;

public class rotatearray1position {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= {1,2,3,4};
		
		// System.out.println(d);
		
		int n = a.length;
		int d=1;
		d= d%n;
		int temp[] = new int[n];
					
		for(int i=a.length-1;i>(n-d)-1;i--) {
		
			try {
				temp[i]=a[i];
			//	a[0]= temp[i];
				System.out.println("--"+temp[i]);
			//	System.out.println("---"+temp[i]);
				
				
				//a[i]=temp[i];// last value store 
			}
			catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
			}
			
		}
		for(int i=a.length-1;i>0;i--) {
			
			a[i]=a[i-1];
		}
		for(int i=0;i<d;i++) {
			
			a[i]=temp[a.length-d];
		}
		//System.out.println(t);
		Arrays.stream(a).forEach(num->{System.out.println(num+"");});
	}

}
