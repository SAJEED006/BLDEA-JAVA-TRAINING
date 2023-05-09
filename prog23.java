import java.util.Arrays;

public class prog23 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					System.out.println("Arrays not equal");
					System.exit(0);
				}
			}
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays not equal");
		}

	}
}