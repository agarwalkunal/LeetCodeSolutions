class Solution {
    public String removeDuplicates(String S) {
       StringBuilder result = new StringBuilder();
		 Stack<Character> stack = new Stack<>();
		 boolean discard_flag = false;
		 
		 
		 
		 for(int i=0;i<S.length(); i++)
		 {
			 char c = S.charAt(i);
			 
			 
			 while(!stack.isEmpty() && c == stack.peek())
			 {
				 stack.pop();
				 discard_flag = true;
			 }
			 
			 if(discard_flag == false)
				 stack.push(c);
			 discard_flag = false;
			 
		 }
		 
		 while(!stack.isEmpty())
			 result.append(stack.pop());
		 
	     return result.reverse().toString();
        
    }
}
