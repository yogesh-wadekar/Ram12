package Yogesh;

public class Num {
public static void main(String[] args)
{
	int n=10;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for (int j=i;j<=n;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	int y=10;
	for(int i=1;i<=y;i++)
	{
		for(int j=i;j<=i;j++)
		{
			System.out.print(" ");
		}
		for (int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
