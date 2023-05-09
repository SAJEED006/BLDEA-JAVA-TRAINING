import java.util.Scanner;

class prog24
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		int vowel=0;
		int cons=0;
		for(int i=s1.length()-1;i>=0;i--)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e' ||s1.charAt(i)=='i'||s1.charAt(i)=='o' ||s1.charAt(i)=='u')
			{
				vowel++;
			}
			else
			{
				cons++;
			}
		}
		System.out.println("the vowels count is:"+vowel);
		System.out.println("the consonant count is:"+cons);
		
	}
}
