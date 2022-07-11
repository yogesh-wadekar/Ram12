package Yogesh;

public class PalindromeNo {
	public static void main(String args[])
	{
		int temp=11311;
		int a=temp;
		int rev=0,mod;
		while(a!=0)
		{
			mod=a%10;
			rev=rev*10+mod;
			a=a/10;
		}
		System.out.println("Reverse number is="+rev);
		if(rev==temp)
		{
			System.out.println("Given Number is palindrom");
		}
		else 
			System.out.println("Not a palindrom number");
	
	}
}
