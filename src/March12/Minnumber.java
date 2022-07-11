package March12;

public class Minnumber {

public static void main(String[] args)
	{
	int a=75, b=70, c=70;
	//Find Min number from given 3 numbers
	if (a==b && b==c && a==c)
	{
		System.out.println("All amonut are same");
	}
	else if(a<b && a<c)
		
	{
	System.out.println(a+" is min value");
	}
	else if(b<a && b<c)
	{
	System.out.println(b+" is Min value");
	}
	else
	{
	System.out.println(c+ "is Min value");
	}
		}
	}

