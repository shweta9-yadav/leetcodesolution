package tested;
// kadane algorith is maximum sum in contiguous order
public class kadanealogorithm {
	public static void main(String[] args) {
		int[] a = {-10,-2,-3,-4};
		
		int first=a[0];
		int sum =a[0];
		for(int i=0;i<a.length;i++) {
		sum =sum+a[i];
		System.out.println("="+sum);
			if(a[i]>sum) {
				System.out.println("=="+a[i]);
				sum=a[i];// set sum to first begin start
			}
			if(first<sum) {
				System.out.println("=-"+sum);
				first=sum;
			}
		}
		System.out.println(first);
		
	

	}
	
}
