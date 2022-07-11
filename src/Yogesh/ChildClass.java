package Yogesh;

public class ChildClass extends ParentClass{
public void C1()
{
	System.out.println("Hi I am Child Class");
}
public static void main(String args[])
{
	ChildClass obj=new ChildClass();
	obj.C1();
	obj.P1();
}
}
