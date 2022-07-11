package Yogesh;

public class ReverseNo {
	public static int no=12345;
	
public int rev(int a)
{
	System.out.println(no);
	int rev=0;
	while(a!=0)
	{
		rev=rev*10+a%10;
		a=a/10;
	}
	return rev;

}

	public static void main(String args[])
{
		ReverseNo obj=new ReverseNo();
		int h=obj.rev(no);
		System.out.println(h);
		if(no==h)
		{
			System.out.println("No is palindrome number");
		}
}

}
