package Yogesh;

public class Cons {

	Cons()//user define constructor
	{
		System.out.println("Hello I am Contructor program");
	}
	public void cons(int a)
	{
		System.out.println("Hello I am test");
	}
	public static void main(String args[])
	{
		Cons obj=new Cons();//Constuctor can be only called during object creation 
		obj.cons(2);
		//Cons obj2=new Cons();
	}
}


