package Yogesh;

import March12.prime2;

// import all classes from March12 package
// we can import only Packages's class here
// we can't import package directly

public class Test1 {
    public String i="Object define program";
    public int j=100;
    
    public static void main(String[] args)
    {
    	Test1 obj1= new Test1();
    	System.out.println(obj1.i);
    	System.out.println(obj1.j);
    	
    	// if want to access other class data then we need to create object in this class
    	// Object allocate memory space whenever they are created
    	// we can create more then one object in a class
    	Test obj=new Test();
    	System.out.println(obj.a);
    	System.out.println(obj.b);
    	
    	//Access other package's class 
    	prime2 obj2=new prime2();
    	System.out.println(obj2.d);
    	}
}
