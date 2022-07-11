package Yogesh;

public abstract class AbstractClass {
	
	 
	public final static void test1()
	{
		System.out.println("complete method");
	}
	public abstract void test();
	
	
public static void main(String[] args) {
	AbstractClass.test1();
	
	//	AbstractClass obj=new AbstractClass();// Can not instantiated abstart class
	}
}

