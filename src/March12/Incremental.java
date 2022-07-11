package March12;

public class Incremental {
	
		public static void main(String[] args)
	{
	int a=1;
	a++;
	System.out.println(a);//1+1=2
	//int a=1;
	//System.out.println(a++);//1  but store in memory 2. it consider in next defined place
	
	
	a++;
	System.out.println(a);//2+1= 3
	a=-a;
	System.out.println(a);// -3
	--a;
	System.out.println(a);//-4 
	a--;
	System.out.println(a);// -5
	++a;
	System.out.println(a);// -4
	a--;
	System.out.println(a);// -5
	a--;
	System.out.println(a);// -6
	a--;
	System.out.println(a);// -7
	++a;
	System.out.println(a);// -5
	}
	

}
