package Yogesh;

public class Cons1 {
Cons1()
{
	System.out.println("Default Constructor");
}
public Cons1(int a)
{
	System.out.println("Public Constructor");
}
private Cons1(int b, String c)
{
	System.out.println("Private Constructor");
}
protected Cons1(int b, String c, char d)
{
	System.out.println("Protected Constructor");
}
public static void main(String args[])
{
	Cons1 obj=new Cons1(1);
	Cons1 obj1=new Cons1(10,"Yogesh");
	Cons1 obj2=new Cons1(20,"Yogesh",'W');
}
}
