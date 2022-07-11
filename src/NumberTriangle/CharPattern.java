package NumberTriangle;

public class CharPattern {
	public static void main(String[] args) {

		int n=5;
		for(int i=1,k=1;i<=n;i++,k++)
		{

			   for(int j=1;j<=i;j++)//2 2
			   {
	              System.out.print(k+" ");
			   }

			   for(int j=i;j<n;j++)
			   {
			      System.out.print("  ");
			   }
		   for(int j=i;j<n;j++)
		   {
		      System.out.print("  ");
		   }
		   
		   for(int j=1;j<=i;j++)//2 2
		   {
              System.out.print(k+" ");
		   }
		   
         System.out.println();
		}
		}
}




