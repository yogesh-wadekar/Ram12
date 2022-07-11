package March12;

public class Prime {
	public static void main(String[] agrs)
	{
	int a=5, b=1, c=0;

	while(b<=a)
	  {
	if (a%b==0)
	    {
	c++;
	    }
	b++;
	  }
	     if(c==2)
	     {
	         System.out.println(a+" Is prime number");
	     }
	     else 
	     {
	        System.out.println(a+"  is not prime number");
	     }
	
	}
	}
	
