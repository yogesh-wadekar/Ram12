package Yogesh;

public class NonPrimitive {
public static void main(String args[])
{
	String a= "Desire";
	String b=new String ("desire");	
	System.out.println("Any Charachter in String= "+a.charAt(2));
	int leg=a.length();
	System.out.println("String length= " +leg);
	System.out.println("UpperCase= "+a.toUpperCase());
	System.out.println("LowerCase= "+a.toLowerCase());
	boolean result=a.equals(b);
	System.out.println("String are equal or not= "+result);
	boolean result1=a.equalsIgnoreCase(b);
	System.out.println("Strings are equal or not= "+result1);
	System.out.println(a);
	System.out.println("Concatination= "+a.concat( " Maker"));
	String c=a.toLowerCase();
	System.out.println(c);
	boolean v=a.contains("ir");
	System.out.println("Contain checking= "+v);
	System.out.println("SubString= "+a.substring(1));
	System.out.println("SubString= "+a.substring(1,4));
}
}
