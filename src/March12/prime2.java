package March12;

public class prime2 {
	public int a,b,c;
	public String d= "Package March12";
public static void main (String args[])
{
	for(int a=2;a<=25;a++)
	{
		int c=0;
		for(int b=2;b<a;b++)
		{
			if(a%b==0)
			{
				c++;
			}
		}
		if(c==0)
		{
			System.out.println(a);
		}
	}
}
}
