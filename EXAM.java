package package2;

import java.util.Arrays;

public class EXAM 
{
	public static void main(String[] args) 
	{
		int num [] = {10, 20, 30, 40};
		int max = num[0];
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]>max)
			{
				max = num[i];
			}
		}
		System.out.println(max);
	}
	
}
