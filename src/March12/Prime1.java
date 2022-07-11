package March12;

public class Prime1 {
public static void main(String[] args)
{
	
	for(int a=1;a<=50;a++)
	{
		boolean prime=true;	
		for( int b=2;b<a;b++)
		{
			if(a%b==0)
			{
				prime=false;
			}
		}
		if(prime)
		{
	
			System.out.println(a);
			
		}
	}
}
}
