package March12;

public class PrimeNO {

		public void Prime(int a){
		for(int i=2;i<=a;i++)
		{
			int k=0;
		for(int j=1;j<=i;j++)
		{
		if(i%j==0)
		{
			k++;
		}
		}
		if(k==2)
		{
		System.out.println(i+" Is prime");
		}
		}
		}
		public static void main(String args[]){
		PrimeNO obj=new PrimeNO();
		obj.Prime(20);
		}
		}

