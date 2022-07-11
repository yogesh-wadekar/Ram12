package StarTriangle;

public class DoubleHill {

	public static void main(String args[])
	{
		int n=10;
		for(int i=1;i<=n;i++)
		{
			//Decrease space
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			
			//Increase star
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}

			//Decrease space
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			
			//Increase star
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

