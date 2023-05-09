import java.util.Scanner;

public class prog21
{
	public static int linearsearch(int a[],int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				return (i+1);
			}
		}
		return 0;
	}



	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key to be searched");
		int key=sc.nextInt();
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int res=linearsearch(a,key);
		if(res>0)
		{
			System.out.println("element found"+(res));
		}
		else
		{
			System.out.println("element not found");
		}
	}
}



