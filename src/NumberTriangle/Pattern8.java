package NumberTriangle;

public class Pattern8 {
	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n;i++)
		{
			for (int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for (int j=i,k=i;j>0;j--,k+=5)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}
		}

}
