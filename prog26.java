import java.util.Scanner;

public class prog26 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string-1");
		String s1=sc.nextLine();
		System.out.println("enter the string-2");
		String s2=sc.nextLine();
		if(s1.equalsIgnoreCase(s2)==true)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}

	}  
}
