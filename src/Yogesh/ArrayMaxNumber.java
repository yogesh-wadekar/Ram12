package Yogesh;

public class ArrayMaxNumber {
	public static void main(String[] args) {

		String s1="Yogesh";
		String s2="Wadekar";
		int sleng1=s1.length();
		int sleng2=s2.length();
		System.out.println("String length= "+sleng1);

		int a[]= {1,2,3,8,5,6,9,9,8,8};
		int leng=a.length, count=0;
		System.out.println("Array length= "+leng);
		int max=a[0];
		System.out.println("array first number= "+max);
		for(int i=0;i<=sleng1-1;i++)
		{
			int count1=0;
			for(int j=0;j<=sleng2-1;j++)
			{
				if(s1.charAt(i)==(s2.charAt(j)))
				{
				    count1++;
				}
			}
		
			if(count1>0)
			System.out.println("Duplicate char \""+s1.charAt(i)+"\" count= "+count1);
			
		}
		
		for(int i=0;i<=leng-1;i++)//1
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		for(int i=0; i<=leng-1;i++)
		{
			if(a[i]==max)
			{
			count++;
			}
		}
		System.out.println("Max no in Array= "+max);
		System.out.println("count is= "+count);
}
}