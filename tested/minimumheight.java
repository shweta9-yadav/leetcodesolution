package tested;

import java.util.Arrays;

public class minimumheight {
	public static void main(String[] args) {
	int[] arr = {1,8,10,6,4,6,9,1};
	int k=8;
	int temp=0;
	
//	for(int i=0;i<arr.length;i++) {
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]>arr[j]) {
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//	}
//	
	Arrays.sort(arr);
	int min=arr[0];//1
	int max=arr[arr.length-1];//10
	int ans = max-min;
	for(int i=1;i<arr.length;i++) {
	
			min=Math.min(arr[0]+k, arr[i]-k);
			max= Math.max(arr[arr.length-1]-k, arr[i-1]+k);
			ans=Math.min(ans, max-min);

	}
	
	System.out.println(min+"----"+max);
	System.out.println(ans);

}
}