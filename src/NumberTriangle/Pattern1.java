package NumberTriangle;

public class Pattern1 {
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			//int k=1;
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+i);
				//k++;
			}
		
		System.out.println();
		}
		}

}
