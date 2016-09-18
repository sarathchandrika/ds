public class PBalance
{
	static char stack[] = new char[10]; 
	static String exp = "{([](){})[]}";
	static String  EXP = new String(exp);
	static int top = -1 ;
	
	public static void push(char x)
	{
		if(top == 10)
		{
			System.out.println("The stack is full");	
		}
		else
		{
			top ++;
			stack[top] = x;	
		}	
	}
	
	public static void pop() 
	{
		if(top == -1)
		{
			System.out.println("The stack is empty");
			
		}
		stack[top] = 0;
		top--;
	}

        public boolean isFull()
	{
	   if (top == 10)
	    return true;
	   else
	    return false;
	}
	
	public boolean isEmpty()
	{
	   if(top == -1)
	    return true;
	   else
	    return false;
	}

	public static boolean OpeningBracket(char x)
	{
		switch(x)
		{
			case '{': return true;
			case '(': return true;
				  
			case '[': return true;
				  
			default : return false;
		} 
	}

	public static char CorrespondingBracket(char x)
	{
		switch(x)
		{
			case '{': return '}';
				  
			case '(': return ')';
				  
			case '[': return ']';
				  
			default : return 'a';
		} 
	}

	public static void main(String [] args)
	{
		for(int i=0 ; i<EXP.length(); i++)
		{
			char c = EXP.charAt(i);
			if(OpeningBracket(c))
			{
				push(c);
			}
		
			if(EXP.charAt(i) == CorrespondingBracket(stack[top]))
			{
				pop();				
				i += 1;
			}
		}
		if(top == -1)
			System.out.println("Paranthesis is Balenced");
		else
			System.out.println("Paranthesis is not Balenced");
	}

}
						


