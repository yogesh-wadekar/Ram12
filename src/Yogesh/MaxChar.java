package Yogesh;
public class MaxChar {
	public static void main(String args[])
	{
		String s="Costructor are use to initializing the objects and they are invoke implicitly";
		s=s.replaceAll("\\s", "");// remove space from string
		int arr[]=new int[256];
		
		//set int array with same char present in string means we count present char
		for (int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}		
		
		//we find max from array
		int max=-1;
		char c=' ';
		for(int j=0;j<s.length();j++)
		{
			if(max<arr[s.charAt(j)])
			{
			max=arr[s.charAt(j)];
			c=s.charAt(j);
			}
		}
		System.out.println(c+" Character Maximum occure in String= "+max);
	}
}

