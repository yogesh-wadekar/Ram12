package Yogesh;

public class concreteclass extends AbstractClass {
	public void test()
	{
		System.out.println("I am Concrete Class");
	}
	public static void main(String[] args) {
		concreteclass obj=new concreteclass();
		obj.test();
		int a='A';
		int b='Z';
		int c='a';
		int d='z';
		int e[]= {'0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','@','#'};
		int f=e.length;
		for(int i=1;i<=f-1;i++)
		{
			System.out.println(i+" Acscii value "+e[i]);
		}
		
		System.out.println("A ascii value "+a);
		System.out.println("Z ascii value "+b);
		System.out.println("a ascii value "+c);
		System.out.println("z ascii value "+d);
		
	}
}
