package Interface1;

public interface client2 {  //Method Overriding allows in interface
	void input();
	static void input1()
	{
		System.out.println("Input of class2 ");
	}
	 
	private static void output()  //we can override Private Method
	 {
		System.out.println("Private method Here");//Private method body compulsory 
	 }
	
    default void output5()  // we can override in Interface but implements in class(not override in class) 
	{                       
		System.out.println("Default method in Client2 class");
	}// we write default method but we can not access in main but access in other class

	
	
	 public static void main(String[] args) {
		client2.output();
		//client.output1();         //we can not access default method in main
		//client obj=new client();  //we can not create object of interface
	}
	

}
