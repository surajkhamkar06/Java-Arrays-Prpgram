package package1;

import java.util.Arrays;

public class AssendingOrder 
{
	public static void main(String[] args) 
	{
		int arr [] = {41, 22, 47, 52, 97};
		
		int temp = 0;
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
//		for(int num  : arr)
//		{
//			System.out.print(num + " ");
//		}
		
	}
}
