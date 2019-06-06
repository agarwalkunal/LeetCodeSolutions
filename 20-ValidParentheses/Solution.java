import java.util.HashMap;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid(	"[[{()]]"	));
	}
	
	    public static boolean isValid(String s) {
	        	Stack<Character> open_parentheses = new Stack<Character>();
		        HashMap<Character, Character> parentheses_type = new HashMap<Character,Character>();
		        
		        parentheses_type.put(')', '(');
		        parentheses_type.put(']', '[');
		        parentheses_type.put('}', '{');
		        
		        for(int i = 0; i<s.length(); i++)
		        {
		        	if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') 
		        		open_parentheses.push(s.charAt(i));
		        	
		        	else
		        	{	
		        		if(!open_parentheses.isEmpty())
		        		{
		        		    if(parentheses_type.get(s.charAt(i)) != open_parentheses.pop() )
		        				return false;
		        		}
		        		else
		        			return false;
		        	}
		        }
		        
		        if(!open_parentheses.isEmpty())
		        	return false;
	        
		        return true;
	    }
	}
