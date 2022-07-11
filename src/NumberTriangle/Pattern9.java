package NumberTriangle;

public class Pattern9 {
	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n;i++)
		{
			for (int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for (int j=i,k=1;j >0;j--,k+=1)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}
		}

}
