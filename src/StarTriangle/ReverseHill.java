package StarTriangle;

public class ReverseHill {
	public void RHill()
	{ 
	int n=10;
	for (int i=1;i<=n;i++)
	{
		//Increase space
		for (int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		
		//Decrease star
		for (int j=i;j<n;j++)
		{
			System.out.print("*");
		}
		
		//Decrease star
		for (int j=i;j<=n;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
public static void main(String args[])
{
	ReverseHill obj=new ReverseHill();
	obj.RHill();
}
}