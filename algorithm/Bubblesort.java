package algorithm;
//it will be medium 
public class Bubblesort {
public static void main(String[] args) {
	int[] a ={2,5,2,3,8,4,9,1};
	//it will check current or previous order if not swap it both n-1 
	for(int i=a.length-1;i>=0;i--) {
		for(int j=0;j<=i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int k:a) {
		System.out.println(k);}
	}
}
