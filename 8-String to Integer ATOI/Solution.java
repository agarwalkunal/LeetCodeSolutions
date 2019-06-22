class Solution {
    public int myAtoi(String str) {
        boolean numberStart = false;
		boolean negative = false;
		boolean nonZeroStart = false;
		int counter = 0;
		
		long output = 0L;
		char[] myArray = str.trim().toCharArray();
		
		for(char c : myArray)
		{
			if(c == '-' && !numberStart)
			{
				negative = true;
				numberStart = true;
			}
			
			else if(c == '+' && !numberStart)
			{
				numberStart = true;
			}
			
			else if(c>= 48 && c<= 57)
			{
				if(c == 48 && !nonZeroStart)
				{
                    numberStart = true;
					continue;
				}
				if(c >48)
				{
                    numberStart = true;
					nonZeroStart = true;
				}
				output = output*10 + c - 48;
				counter++;
			}
			else
				break;
			
		}
		
		if(negative) {
			if(counter > 10)
				output = -1 *  Integer.MIN_VALUE;
			else if(output > Integer.MAX_VALUE)
				output = -1 * Integer.MIN_VALUE;
			else
				output = -1 * output;
		}
		
		if(!negative && (output > Integer.MAX_VALUE || counter > 10))
		{
			output = Integer.MAX_VALUE;
		}
		
		
		return (int)output;
    }
}