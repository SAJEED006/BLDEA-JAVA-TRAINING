import java.util.Scanner;

public class prog15 {
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int count=i;
			for(int j=1;j<=n;j++)
			{
				System.out.print(count+ " ");
				count=count+5;
			}
			System.out.println();
		}
	}

}
