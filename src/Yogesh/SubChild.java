package Yogesh;

public class SubChild extends ChildClass {
public void S1()
{
	System.out.println("Hi I am SubChild Class");
}
public static void main(String args[])
{
	SubChild obj=new SubChild();
	obj.P1();
	obj.C1();
	obj.S1();
}
}
