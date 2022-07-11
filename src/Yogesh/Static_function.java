package Yogesh;

public class Static_function {
	
	public int a=10;
	static int b=20;
	
	public void demo1() {
		System.out.println("Hi I am Yogesh");
	}
	
	static void demo2() {
		System.out.println("Now I am Studing");
	}
	
	public static void main(String args[])
	{
	Static_function obj=new Static_function();
	obj.demo1();
	Static_function.demo2();//Using Class name access all STATIC Method & Variables
	System.out.println(Static_function.b);
	System.out.println(obj.a);//Using Object we can access all NON STATIC method 
	}                             //OR variables from the Class

}
