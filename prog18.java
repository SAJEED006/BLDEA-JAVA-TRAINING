
import java.util.Scanner; 

public class prog18 {

	
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of n:");
			int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				// pattern of S
				for(int j=0;j<n;j++)
				{
					if((i==0 && j<=n/2 && j!=0) ||
							j==0 && i<(n/2) && i!=0 
							||i==(n-1) && j<(n/2)
							|| i==(n/2) && j<(n/2) && j!=0
							|| j==(n/2) &&  i!=(n-1) &&  i>(n/2))

					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}

				System.out.print("  ");

				// pattern of A
				for(int j=0;j<n;j++)
				{
					if(j==0 && i!=0 
							|| j==(n/2) && i!=0 
							|| i==0 &&  j!=0 && j<(n/2) 
							|| i==(n/2) && j<(n/2))

					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}

				System.out.print("  ");

				// pattern of J

				for(int j=0;j<n;j++)
				{
					if(j==0 && i>(n/2) && i!=(n-1) 
							|| i==(n-1) && j<(n/2) && j!=0
							|| j==(n/2) && i!=(n-1)
							|| i==0 )

					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}

				System.out.print("  ");

				// pattern of E
				for(int j=0;j<n;j++)
				{
					if(j==0
							|| i==0 && j<(n/2)
							|| i==(n-1) && j<(n/2) 
							|| i==(n/2) && j<(n/2))

					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}

				System.out.print("  ");

				System.out.print("  ");
				// pattern of E

				for(int j=0;j<n;j++)
				{
					if(j==0
							|| i==0 && j<(n/2) 
							|| i==(n-1) && j<(n/2) 
							|| i==(n/2) && j<(n/2))

					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}

				System.out.print("  ");

				//pattern of D
				for(int j=0;j<n;j++)
				{
					if(j==0 
							|| j==(n/2) &&  i!=0 && i!=(n-1)
							|| i==0 && j!=0 && j<(n/2)
							|| i==(n-1) && j!=0 && j<(n/2) )

					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}

				System.out.println("  ");
			}

		}
	}

