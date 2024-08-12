package tested;
import java.util.*;

public class unionarray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter m length:");
		int m = sc.nextInt();
		System.out.println("enter n length:");
		int n = sc.nextInt();
		 int[] a = new int[m];
		 int[] b = new int[n];
		 for(int i=0;i<m;i++) {
			 System.out.println("enter a arr:");
			 a[i] = sc.nextInt();
		 }
		 for(int i=0;i<n;i++) {
			 System.out.println("enter b arr:");
			 b[i] = sc.nextInt();
		 }
		 unionarray s = new unionarray();
		 s.unioun(a,b,m,n);
	}

	private int unioun(int[] a, int[] b, int m, int n) {
		// TODO Auto-generated method stub
		HashSet<Integer> array = new HashSet<>();
		for(int num:a) {
			array.add(num);
		}
		for(int num:b) {
			array.add(num);
		}
		int[] arr = new int[array.size()];
		int index=0;
		for(int num:arr) {
			arr[index++] = num;
		}
		return arr.length;
		
	}

}


	

