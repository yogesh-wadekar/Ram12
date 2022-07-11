package Yogesh;

public class ArmstrongList {
	public static void main(String args[])
		{
		
		for(int j=1;j<=200;j++)
		  { 
			int t1=0,t2=0;
			int len=0;
			int rem,Arm=0;
			t1=j;
			while(t1!=0)
			{ 
				t1=t1/10;
				len=len+1;
			}
            t2=j;
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
		  
			if(Arm==j)
			{
				System.out.println(j+ " is Armstrong number");
			}
			else
			{
				//System.out.println(j+ " is Not Armstrong number");
			}	
	}
	}
}

