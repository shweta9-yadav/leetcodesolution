package tested;
import java.util.*;
public class sumfourtarget {
	 public List<List<Integer>> fourSum(int[] nums, int target) {
	        Arrays.sort(nums);
	        int n = nums.length;
	        Set<List<Integer>> result = new HashSet<>();
	        Map<Integer, List<int[]>> twoSumMap = new HashMap<>();

	        // Store all pairs of sums in the hashmap
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                int pairSum = nums[i] + nums[j];
	                if (!twoSumMap.containsKey(pairSum)) {
	                    twoSumMap.put(pairSum, new ArrayList<>());
	                }
	                twoSumMap.get(pairSum).add(new int[]{i, j});
	            }
	        }

	        // Check for complementary pairs that add up to the target
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                int currentSum = nums[i] + nums[j];
	                int complement = target - currentSum;
	                if (twoSumMap.containsKey(complement)) {
	                    for (int[] pair : twoSumMap.get(complement)) {
	                        int k = pair[0];
	                        int l = pair[1];
	                        // Ensure no index overlaps
	                        if (k > j) {
	                            List<Integer> quadruplet = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
	                            result.add(quadruplet);
	                        }
	                    }
	                }
	            }
	        }

	        return new ArrayList<>(result);
	    }

	    public static void main(String[] args) {
	    	sumfourtarget fs = new sumfourtarget();
	        int[] nums = {-1,0,-5,-2,-2,-4,0,1,-2};
	        int target = -9;
	        List<List<Integer>> results = fs.fourSum(nums, target);
	        for (List<Integer> list : results) {
	            System.out.println(list);
	        }
	    }

}
