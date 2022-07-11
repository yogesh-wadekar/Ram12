package NumberTriangle;

public class PalindomNumber {
public static void main(String[] args) {
		int a=12345;
		int temp=a;
        int rev=0;
		while(temp!=0)
        {
	      int mod=temp%10;
	      rev=rev*10+mod;
	      temp=temp/10;
        }
	//	System.out.print(rev);
		if(rev==a)
		{
			System.out.println(a+" Is A Palindrome Number");
		}
		else
		System.out.println(a+" Is NOt A Palindrome Number");
		
}
}