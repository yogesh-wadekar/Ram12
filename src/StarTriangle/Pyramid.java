package StarTriangle;

public class Pyramid {
public void Pyr()
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
		System.out.println();
	}
}
	public static void main(String args[])
	{
		Pyramid obj=new Pyramid();
	    obj.Pyr();
}
}
