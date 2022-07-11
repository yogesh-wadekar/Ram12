package Yogesh;

public class StarTriangle {
public void M(int i)
{
	for(int a=1; a<=i; a++)
	{
		for (int b=1; b<=a; b++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
}

public void M1(int i)
{
	for(int a=1; a<=i; a++)
	{
		for (int b=i; b>=a; b--)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
}

public void M2(int i)
{
	for(int a=1; a<=i; a++)
	{
		for (int b=1; b<=a; b++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
}

public void M3(int i)
{
	for(int a=1; a<=i; a++)
	{
		for (int b=i; b>=a; b--)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
}

public static void main(String args[])
{
	StarTriangle obj=new StarTriangle();
	obj.M(5);
	obj.M1(5);
	obj.M2(5);
	obj.M3(5);
	}
}
