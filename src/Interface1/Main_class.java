package Interface1;

public class Main_class implements client1,client2 {
	public void input()//If public method override in interface here only access  
	{                  //First Implements Interface method
		System.out.println("Complete in class");
	}
	
	public static void main(String[] args) {
		Main_class obj=new Main_class();
		obj.input();
		client2.input1();
		obj.output1();//we can override Default method in interface
		obj.output5();//but after override it show error in implementation class
		//so we can not override default method
		System.out.println(a);//
		//a=20; Interface Variables are always final so we can't change it
		//b=50; Interface Variables are always final so we can't change it
	}

}
