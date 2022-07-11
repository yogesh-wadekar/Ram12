package March12;
public class Forloop {
	public static void main(String agrs[])
	{
     int c=0;	int a;
	System.out.println("Prime number List "); 
	for(a=1;a<51;a++)
	{
	  for(int b=1;b<=a;b++)//check both divide by 1 & itself
	  {
	   if(a%b==0)
	   {
	    c++;
	   }
	  }
	  if(c==2)
	  {
	    System.out.println(a+" -Prime");
	  }
	/*  else 
	  {
	   System.out.println(a+" -Not prime");
	  }*/
	  c=0;
	  }
	System.out.println("Check Prime number upto "+a);	
	}
}
