package Interface1;

interface client1 {// by default interface are public/Abstract
 public static final int a=10;//Variable always Public&Static&Final not other than this
 //-----------OR-----------
 public int b=20;//if we write it public but it get auto Final in interface
                 // means if we try to change it in other class it Can't CHANGE
 void input();// incomplete method are always public/Abstract
 static void input1()  // static means method require body
 {
	 System.out.println("Input here");
 }
 //private void output()       //Never user locally in another class/package
 private static void output()  //private method always static
 {
	System.out.println("Private method Here");//Private method body compulsory 
 }
 default void output1()//default method always Non static 
 {                       // if we right static it show error
	System.out.println("Default method in Client1 class");
 }// we write default method but we can not access it in main but access in other class
//Private & Default method access only with in Interface
 
 public static void main(String[] args) {
	client1.input1();
	System.out.println(client1.a);
	System.out.println(client1.b);
	client1.output(); 
	//client1.output1();//we can not access default or Non static method in main
	//client obj=new client();  //we can not create object of interface
}
}
