class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();
		
		for(int i=0; i<S.length(); i++)
		{
			char c = S.charAt(i);
			
			if(c != '#')
			{
				s1.push(c);
			}
			
			else if(c == '#')
			{
				if(!s1.empty())
					s1.pop();
			}
		}
		
		for(int i=0; i<T.length(); i++)
		{
			char c = T.charAt(i);
			
			if(c != '#')
			{
				s2.push(c);
			}
			
			else if(c == '#')
			{
				if(!s2.empty())
					s2.pop();
			}
		}
		
		if(s1.empty() && s2.empty())
			return true;
        
        if(s1.size() != s2.size())
				return false;
		
		while(!s1.empty() && !s2.empty())
		{
			if(s1.pop() != s2.pop())
				return false;
		}
	
		return true;
        
    }
}
