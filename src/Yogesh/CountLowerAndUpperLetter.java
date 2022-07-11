package Yogesh;

public class CountLowerAndUpperLetter {
public static void main(String[] args) {
	String s="Welcome To Automation";
	int upper=0;
	int lower=0;
	for (int i=0;i<=s.length()-1;i++)
	{
		char ch=s.charAt(i);
		if(ch>='a' && ch<='z')
			lower++;
		else if(ch>='A' && ch<='Z')
			upper++;
	}
	System.out.println("Upper count= "+upper);
	System.out.println("Lower count= "+lower);
}
}
