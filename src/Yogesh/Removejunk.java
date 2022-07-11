package Yogesh;

public class Removejunk {
	public static void main(String[] args) {
		String s="@##A###@123$@cce>n<?tu&^re";
		s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
		
		String a="Accecnture";
		int leg=a.length();
		int count=0;
		for(int i=0;i<=leg-1;i++)
		{
			if(a.charAt(i)=='c')
			{
				count++;
			}
		}
			System.out.println("Count of c=" +count);
		

	}

}
