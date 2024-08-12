package algorithm;
//good 
public class InsertionSort {
// it will check it will be correct order start with 2 check n+1 like 
	public static void main(String[] args) {
		int[] a = {8,3,4,9,2,1};
		for(int i=0;i<a.length;i++) {
			int j=i;
			while(j>0 && a[j-1]>a[j]) {
				int temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
				j--;
			}
		}
	}
}
