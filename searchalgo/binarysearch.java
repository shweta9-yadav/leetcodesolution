package searchalgo;

import java.util.Arrays;
// binary search algorithm list to be sorted order divided search in two parts 
public class binarysearch {
	public static void main(String[] args) {
		int[] a= {4,5,2,4,7,8,1};
		int t =8;
		int l=0;
		int r = a.length+1;
		int k =-1;
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(a[mid]==t) {
				k=mid;
			}
			if(a[mid]< t) {
				l = mid+1;
			}
			else {
				r = mid-1;
			}
		}
		int target =8;
		System.out.println(getData(a,target));
	}

	private static int getData(int[] a, int target) {
		// TODO Auto-generated method stub
		
		Arrays.sort(a);
		//for
		return -1;
	}

}
