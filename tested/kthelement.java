package tested;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

public class kthelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("enter arr size:");
			int n =sc.nextInt();
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++) {
				System.out.println("enter arr no:");
				arr[i]=sc.nextInt();
			}
			System.out.println("enter arr find:");
			int k =sc.nextInt();
			sol s = new sol();
			System.out.print(s.ktsmallest(arr,0,n-1,k));
		
	}
	

}

class sol{

	public static int ktsmallest(int[] arr, int i, int j, int k) {
		int temp=0;
		int a=0;
		for(int m=0;m<arr.length;m++) { // 5 
			for(int n=m+1;n<arr.length;n++) {
				if(arr[m]>arr[n]) {
					temp=arr[m];
					arr[m]=arr[n];
					arr[n]=temp;
				}
			}
		}
		for(int z=0;z<arr.length;z++) {
			if(z==k) {
				a=arr[z];
			}
		}
		return a;
	}
	
}
