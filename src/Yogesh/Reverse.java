package Yogesh;

public class Reverse {
public static void main(String args[])
{
	//BY USING STRING
	String a="Yogesh";
	int len=a.length();
	for(int i=len-1; i>=0;i--)
	{
		System.out.print(a.charAt(i));
	}
	
	//BY USING ARRAY
	String [] b= {"Yogesh","Wadekar"};
	String c=b[1];
	int len1=c.length();
	for (int j=len1-1;j>=0;j--)
	{
		System.out.print(c.charAt(j));
	}
	
	//Count Char from String
    int count=0;
    for (int k=len-1;k>=0;k--)
    {
    	if(a.charAt(k)=='e')
    	{
    		count++;
    	}
    }
    System.out.println(count);
}
}
