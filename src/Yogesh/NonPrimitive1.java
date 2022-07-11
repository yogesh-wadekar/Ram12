package Yogesh;

public class NonPrimitive1 {
public static void main(String[] args)
{
	 int count=0;
  String name="Velocity IN Pune";
  int leg=name.length();
  for(int i=leg-1;i>=0;i--)
  {
	  
	  
	  System.out.println(name.charAt(i));
  }
  for (int j=leg-1; j>=0; j--)
  {
	  if(name.charAt(j)==' ')
	  { 
		  count++;
	  }
	  System.out.println();
  }
}
}
