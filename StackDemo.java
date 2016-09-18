public class StackDemo
{
	private static int n_size = 10;
	static int stack[] = new int[n_size];
	static int top = -1;
	
	public void push(int x)
	{
	  if (top == n_size)
		System.out.println("Stack is full : Overflow");
	  else
	   {
	     top++;
             stack[top] = x;
	     System.out.println("Inserted element into stack is " + x);
	     System.out.println("Elements in array after addition ");
	     displayElements();
	   }
	}
	
	public void pop()
	{
	  if(top == -1)
	       System.out.println("Stack is empty : Underflow");
	  else
	   {
	     int x;
	     x = stack[top];
	     System.out.println("Removed element is "+x);
	     stack[top] = 0;
	     top--;
             System.out.println("Elements in array after removal is ");
             displayElements();
	   }
	}

	public boolean isFull()
	{
	   if (top == n_size)
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
	
	public static int getTop()
	{
	  if(top == -1 )
	   return 0;
	  else
	  return stack[top];
	}
	
	public void displayElements()
	{
	  for(int i=0 ; i<=top ; i++)
	   {
		System.out.print(stack[i]);
	   }
        }

	public static int getSize()
	{
	  return n_size;
	}
	
	public static void main(String [] args)
	{
	   StackDemo s = new StackDemo();
	   s.push(5);
	   s.pop();
	   int m = s.getSize();
	   System.out.println("Size of stack is " + s.getSize());
	   int n = s.getTop();
	   System.out.println("Top of stack is " + s.getTop());
	}
}


