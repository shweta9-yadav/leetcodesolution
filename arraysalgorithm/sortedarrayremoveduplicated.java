package arraysalgorithm;
import java.util.*;
public class sortedarrayremoveduplicated {
	
	public static void main(String[] args) {
		int i =0;
		int[] nums = {0,1,2,2,1,3,1};
		Arrays.sort(nums);
		
		for(int num:nums) {
//			System.out.println(i+"---"+num);
			if(i < 1 || num > nums[i - 1]) {
				
				nums[i++]= num;
			}
			
		}
		
		for(int num:nums) {
			System.out.println(num);
		}
		
	}

}
