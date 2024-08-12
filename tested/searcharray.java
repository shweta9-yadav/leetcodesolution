package tested;

public class searcharray {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		int target =2;
	
		   int k=0;
	        int max = nums[nums.length-1];
	        
	        if(max<target){
	            k = nums.length;
	        }
	        else{
	        for(int i =0;i<nums.length-1;i++){
	            if(nums[i]== target){
	                k=i;
	            }else if(nums[i]>target && nums[i]<target){
	                k=i;
	            }
	}
	        }
	        System.out.println(k);

	}}
