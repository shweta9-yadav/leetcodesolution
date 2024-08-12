package algorithm;

public class descorder {
	public static void main(String[] args)
	{
		int[] arr1= {1,2,3,4,5,6,7,8,9};
		for(int i =0 ;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]>arr1[j]) {
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]= temp;
				}
			}
		}
		for(int t : arr1) {
			System.out.println(t);
		}
		
	}
}
