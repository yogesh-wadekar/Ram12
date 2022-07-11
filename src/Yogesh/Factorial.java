package Yogesh;

public class Factorial {
public static void main(String args[])
{
	int temp=5,a=temp, fact=1;
	while(a!=0)
	{
		fact=fact*a;
		a--;
	}
	System.out.println("Factorial Number of "+temp+ " is ="+fact);
}
}
