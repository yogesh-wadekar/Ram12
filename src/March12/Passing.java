package March12;

public class Passing {
	public static void main(String[] args)
	{
	int a=30, b=40, c=60, d=75;
	String A="SURESH", B="RAM", C="SHAM", D="RAJU";
    System.out.println("**********RESULT*********");
	if (a<35 || b<35 || c<35 || d<35)
	{
	System.out.println(A+ " Your result is Fail--------Bellow 35 Marks");
	}
	
	if ((a<60 && a>=35) || (b<60 && b>=35) || (c<60 && c>=35) || (d<60 && d>=35) )
      {
	    System.out.println(B+" Your result is Pass-----------<60 OR >=35 Marks");
      }
	if((a<75 && a>=60) || (b<75 && b>=60) || (c<75 && c>=60) || (d<75 && d>=60) )
	    {
	      System.out.println(C+" You got First Class----------<75 OR >=60 Marks");
	    }
	if(a>=75 || b>=75 || c>=75 || d>=75 )  
		{
	System.out.println(D+" You got Distincation--------->=75 Marks");
	}
	}
}

