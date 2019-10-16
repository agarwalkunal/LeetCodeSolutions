class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
		 
		 HashMap<Integer,Integer> pairs = new HashMap<>();
		 
		 Stack<Integer> s = new Stack<Integer>();
		 
		 if(nums2.length>1)
			 s.push(nums2[0]);
		 
		 if(nums2.length == 1)
		 {
			 result[0] = -1;
			 return result;
		 }
		 
		 for(int i=1; i <nums2.length; i++)
		 { 
			 while(!s.empty() && nums2[i] > s.peek())
			 {
				 pairs.put(s.pop(), nums2[i]);
			 }
			 
			 s.push(nums2[i]);
		 }
		 
		 for(int i =0;i<nums1.length;i++)
		 {
			 if(pairs.containsKey(nums1[i]))
				 result[i] = pairs.get(nums1[i]);
			 else
				 result[i] = -1;
		 }
	        return result;
        
    }
}
