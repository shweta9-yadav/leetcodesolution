package algorithm;
//worst case 
public class selectionSort {
	//selection sort to check all with i+1 it will take o(n2)
	public static void main(String[] args) {
		int[] a= {1,3,4,5,6,7,8,9,1,4,5};
		int tem=0;
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					tem=a[i];
					a[i]=a[j];
					a[j]=tem;
				}
			}
			
		}
	}

}
