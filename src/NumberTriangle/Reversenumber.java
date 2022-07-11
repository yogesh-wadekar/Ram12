package NumberTriangle;

public class Reversenumber {
	// TODO Auto-generated constructor stub
   public static void main(String[] args) {
	  int n=1234;
	  int rev=0;
	  while(n!=0)
	  {
		  rev=rev*10+(n%10);//
		  n=n/10;
		  
	  }
	  System.out.print(rev);
}
	
}

//rev= 0*10+(1234%10) so rev=4
//1234/10=   n=123

