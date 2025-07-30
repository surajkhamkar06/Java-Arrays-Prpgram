package package1;

public class Sum 
{
	public static void main(String[] args)
	{
		int a [] = {20, 54, 77, 8, 96, 5};
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
		
	}

}
