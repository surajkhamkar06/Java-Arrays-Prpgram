package package1;

public class MaximumElement 
{
	public static void main(String[] args) 
	{
		int a [] = {1, 22, 36, 45, 76};
		
		int max = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max= a[i];
			}
		}
		System.out.println(max);
	}

}
