

import java.util.Scanner;
public class prog19
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			// I

			for(int j=0;j<n;j++)
			{
				if(i==0 && j<(n/2) || i==(n-1) && j<(n/2) || j==2)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}

			}
			System.out.print("  ");

			// L
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==(n-1) && j<(n/2))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}

			}
			System.out.print("  ");

			// O
			for(int j=0;j<n;j++)
			{
				if(j==0 && i!=0 && i!=(n-1) || j==(n/2) &&  i!=0 && i!=(n-1)
						|| i==0 && j!=0 && j<(n/2) || i==(n-1) && j!=0 && j<(n/2) )
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}

			}
			System.out.print("  ");
			// V

			for(int j=0;j<n;j++)
			{
				if(j==0 && i<9 || j==4 && i<9|| j==1 && i!=(n-1) && i>8
						|| j==2 && i>9 ||  j==3 && i!=(n-1) && i>8)

				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}

			System.out.print("  ");

			// E
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

			// M
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==6 || i==j && j<3 || i+j==6 && j>2 )

				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}

			}
				System.out.print("  ");
				
				// Y
				for(int j=0;j<n;j++)
				{
					if(j==3 && i>=4|| i==j && j<3 || i+j==6 && j>2 )

					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}

				}
					System.out.print("  ");
					
					
					// M
					for(int j=0;j<n;j++)
					{
						if(j==0 || j==6 || i==j && j<3 || i+j==6 && j>2 )

						{
							System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}

					}
						System.out.print("  ");
						
						// O
						for(int j=0;j<n;j++)
						{
							if(j==0 && i!=0 && i!=(n-1) || j==(n/2) &&  i!=0 && i!=(n-1)
									|| i==0 && j!=0 && j<(n/2) || i==(n-1) && j!=0 && j<(n/2) )
							{
								System.out.print("* ");
							}
							else 
							{
								System.out.print("  ");
							}

						}
						System.out.print("  ");
						
						// T
						for(int j=0;j<n;j++)
						{
							if(i==0 && j<7 || j==3 )
							{
								System.out.print("* ");
							}
							else 
							{
								System.out.print("  ");
							}

						}
						System.out.print("  ");
						

						// H
						for(int j=0;j<n;j++)
						{
							if(j==0 || j==(n/2) || i==(n/2) && j<(n/2))
							{
								System.out.print("* ");
							}
							else 
							{
								System.out.print("  ");
							}

						}
						System.out.print("  ");
						
						// E
						for(int j=0;j<n;j++)
						{
							if(i==0 &&  j<(n/2) && j!=0 || i==(n-1) && j!=0 && j<(n/2) || i==(n/2) &&  j!=0 && j<(n/2) || j==0)
							{
								System.out.print("* ");
							}
							else 
							{
								System.out.print("  ");
							}

						}
						System.out.print("  ");
						//R
						for(int j=0;j<n;j++)
						{
							if(j==0 || i==0 && j!=0 && j<(n/2) || j==(n/2) && i!=0 && i<(n/2) || i==(n/2) && j<(n/2) || i-j==(n/2))
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