package Yogesh;

public class ArmstrongNumber {
	public static void main(String args[])
	{
	 	int a=153;
		int t1=a;
		int len=0;
		while(t1!=0)
		{ 
			t1=t1/10;
			len=len+1;
		}

		int t2=a;
		int rem,Arm=0;

		while(t2!=0)
		{
			rem=t2%10;
	        int mul=1;
			for(int i=1;i<=len;i++)
			{
				mul=mul*rem;
			}
			Arm=Arm+mul;
			t2=t2/10;
		}

		if(Arm==a)
		{
			System.out.println(a+ " is Armstrong number");
		}
		else
		{
			System.out.println(a+ " is Not Armstrong number");
		}	
}
}