package March12;

public class nestedfor {
public static void main(String[] args)
{
	System.out.println("Output like  11111");
	for(int a=1;a<6;a++)
	{
		for(int b=1;b<6;b++)
		{
			System.out.print(a);
		}
		System.out.println();
		}

	System.out.println("Output like  12345");
	for(int a=1;a<6;a++)
	{
		for(int b=1;b<6;b++)
		{
			System.out.print(b);
		}
		System.out.println();
		}
	
	System.out.println("Output like  11111");
	for(int a=1;a<6;a++)
	{
		for(int b=5;b>0;b--)
		{
			System.out.print(a);
		}
		System.out.println();
		}
}
}
