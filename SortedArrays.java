package package2;

import java.util.Arrays;

public class SortedArrays
{
	public static void main(String[] args)
	{
		int nums1 [] = {1,3};
		int nums2 [] = {2};
		
		int [] merged = new int[nums1.length + nums2.length];
		
		for(int i=0; i<nums1.length; i++)
		{
			merged[i] = nums1[i];
		}
		
		for(int i=0; i<nums2.length; i++)
		{
			merged[nums1.length + i] = nums2[i];
		}
		
		Arrays.sort(merged);
		System.out.println(Arrays.toString(merged));
	}
}
