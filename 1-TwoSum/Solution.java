import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		
		int[] num = {1,2,4,7,8,9};
		int target = 13;
		int[] out = twoSum(num,target);
		System.out.println(out[0]+ " " + out[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		int[] output = new int[2];
		
		for(int i=0;i<nums.length; i++)
		{
			
			
			if(hash.containsKey(target - nums[i]))
			{
				output[0] = hash.get(target - nums[i]);
				output[1] =i;
			}
			hash.put(nums[i], i);
		}
		return output;
		
		}
}
