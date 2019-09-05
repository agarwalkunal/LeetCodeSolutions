
public class SoultionBrute {

	public static void main(String[] args) {
		//int[] height = {1,8,6,2,5,4,8,3,7};
		
		int[] height = {1,2,1,2,1,2};
		
		System.out.println(maxArea(height));

	}
	
	 public static int maxArea(int[] height) {
		 
		 int max = 0;
		 for(int i =0;i<height.length-1; i++)
		 {
			 int length =1;
			 for(int j = i+1; j<height.length ; j++)
			 {
				 int minHeight = 0;
				 
				 if(height[i] <= height[j])
					 minHeight = height[i];
				 else
					 minHeight = height[j];
				 
				 int tempMax = minHeight * length;
				 
				 length++;
				 
				 if(tempMax > max)
					 max = tempMax;
			 }
		 }
		 return max;
	        
	    }

}
