package NumberTriangle;

public class Pattern11 {
	public static void main(String[] args) {
		
	int n=5;
	for(int i=1;i<=n;i++)
	{
		//int k=1;
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		
		for (int j=i;j<=n;j--)
		{
			System.out.print(j);
			//k++;
		}
	
	System.out.println();
	}
	}

}
