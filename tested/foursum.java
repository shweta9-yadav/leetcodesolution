package tested;

import java.util.*;

public class foursum {
	public static void main(String[] args) {
	List<List<Integer>> test = new ArrayList<>();
	int[] n1 = {-1,0,-5,-2,-2,-4,0,1,-2};
	int target=-9;
	Arrays.sort(n1);
	// sort array
	for(int i =0;i<n1.length;i++) {
		if(i>0 && n1[i]==n1[i-1]) continue;
		 for (int j = i + 1; j < n1.length; j++) { 
             if (j != i + 1 && n1[j] == n1[j - 1]) continue;  
             int currentSum = n1[i] + n1[j];
             int complement = target - currentSum;
            
			int k = j+1;
			int l = n1.length-1;
			
			while(k<l) {
				 int sum = n1[i] + n1[j] + n1[k] + n1[l];
				 
			if(sum == target) {
				 test.add(Arrays.asList(n1[i], n1[j], n1[k], n1[l]));
				//test.add(t);
				k++;l--;
				while(k<l && n1[k]== n1[k-1]) k++;
				while(k<l && n1[l]== n1[l-1]) l--;
			
			}
			else if (sum< target) {
				k++;
				//while (k < l && n1[k] == n1[k - 1]) k++;
			}
			else {
				l--;
				//while (k < l && n1[l] == n1[l + 1]) l--;
			}
		
             }
			
		}
		
	}
	  for (List<Integer> list : test) {
          System.out.println("--"+list);
      }
	
	}
}
