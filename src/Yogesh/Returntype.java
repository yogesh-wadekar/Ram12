package Yogesh;

public class Returntype {
	String a="Yogesh";
	String k=" Wadekar";
public int Add(int a, int b)// return type means return all types of variable type's VALUE 
{
	int c=a+b;
	return c;//we can use same ref_variable in method bcz they are locally used
}

public String StringType(String i)//
{
	String s=a.concat(i);// we can access main method variable in class method
	return s;
}

public static int Multi(int A, int b)// return type means return all types of variable type's VALUE 
{
	int c=A*b;
	return c;//we can use same ref_variable in method bcz they are locally used
}

public static void main(String args[])
{
Returntype obj=new Returntype();
int A=obj.Add(5,10);
System.out.println("Addition Method A="+A);
int B=Returntype.Multi(A,10);//Static METHOD also return value by using ClassName
System.out.println("Multiplication Method B="+B);
String s1=obj.StringType(obj.k);//Use class variable
System.out.println("String Method= "+s1);
}

}
