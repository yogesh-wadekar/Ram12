package Yogesh;

public abstract class AbstarctClass1 extends AbstractClass {
	public void test()
	{
		System.out.println("complete method");
	}
	 
	public static void test1()// we can not override final method
	{
		System.out.println(" hello abstract");
	}
	
	
public static void main(String[] args) {
		//AbstractClass obj=new AbstractClass();// Can not instantiated abstart class
	AbstarctClass1.test1();
}
}


