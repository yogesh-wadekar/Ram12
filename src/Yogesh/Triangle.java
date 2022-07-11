package Yogesh;

public class Triangle {
	public void T1()
	{
	for(int i=1;i<=5;i++)//5
	{
		for (int j=5;j>=i;j--)//
		{
			System.out.print(" * ");	
		}
		System.out.println();
		
	}
	}
	
	public void T2()
	{
	for(int i=1;i<=5;i++)//5
	{
		for (int j=1;j<=i;j++)//
		{
			System.out.print(" * ");	
		}
		System.out.println();
		
	}
	}
	public static void main(String args[])
	{
Triangle obj=new Triangle();
obj.T1();
obj.T2();
}
}
