package Yogesh;

public class ArrarReverse {
public static void main(String args[])
{
	String a[]= {"Yogesh","Wadekar"};
	int b =a[0].length();
	System.out.println(b);
	String j=a[0];
	for (int i=b-1;i>=0;i--)
	{
		System.out.print (j.charAt(i));
	}
}
}
