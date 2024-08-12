package tested;
import java.util.*;

public class minimizetheheight {
	
	public static void main(String[] args) {
		class pair{
			private int index;
			private int value;
			pair(int index,int value){
				this.index=index;
				this.value=value;
			}
			public  int getValue() {
				return this.value;
			}
			public  int getIndex() {
				return this.index;
			}
		}
		Scanner sc = new Scanner(System.in);
		ArrayList<pair> test = new ArrayList<>();
		
		int k = sc.nextInt();
		int t = sc.nextInt();
		int[] arr = new int[t];
		int n= arr.length;
		int[] arr1 = new int[n];
		for(int i=0;i<t;i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]-k>=0)
				test.add(new pair(arr[i]-k,i));
			test.add(new pair(arr[i]-k,i));
			arr1[i]=0;
		}

		Collections.sort(test,new Comparator<pair>() {
			public int compare(pair p1,pair p2) {
				return p1.getValue()-p2.getValue();
			}
		});
		// sort with added index like ({(1,0),(2,0)})
		int ele=0;
		int left=0;
		int right=0;
		int size = test.size();
		while(ele<n && right<size) {
			if(arr1[test.get(right).getIndex()]==0)
				ele++;
			right++;
			arr1[test.get(right).getIndex()]++;
		}
		int ans = test.get(right-1).getValue()- test.get(left).getValue();
		while(right<size) {
			if(arr1[test.get(right).getIndex()]==1) {
				ele--;
			arr1[test.get(left).getIndex()]--;
		left++;
			
			while(ele<n && right<size) {
				if(arr1[test.get(right).getIndex()]==0)
					ele++;
				right++;
				arr1[test.get(right).getIndex()]++;
				
			}
			if(ele==n)
				ans=Math.min(ans, test.get(right-1).getValue()-test.get(left).getValue());
			else
				break;
			
			}
		}
		System.out.println("-----"+ans);
	}
	

}
