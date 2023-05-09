

import java.util.Scanner;

public class prog20 {
public static void main(String[] args) 
{
	int words=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the sentence");
String s=sc.nextLine();
for(int i=s.length()-1;i>=0;i--)
{
	if(s.charAt(i) == ' ')
	{
		words+=1;
	}
}
System.out.println("The total number of words are"+words);
}
}