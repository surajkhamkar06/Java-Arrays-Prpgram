package package1;

import java.util.Arrays;

public class MedianOfTwoSortedArraysEx
{
    public static void main(String[] args)
    {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        MedianOfTwoSortedArraysEx sol = new MedianOfTwoSortedArraysEx();
        double median = sol.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median is: " + median);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] merged = new int[nums1.length + nums2.length];

        // Copy nums1 into merged
        System.arraycopy(nums1, 0, merged, 0, nums1.length);

        // Copy nums2 into merged starting from nums1.length
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        // Sort the merged array
        Arrays.sort(merged);

        int mid = merged.length / 2;

        // If even number of elements, average the two middle ones
        if (merged.length % 2 == 0) 
        {
            return (merged[mid - 1] + merged[mid]) / 2.0;
        } 
        else 
        {
            return merged[mid];
        }
    }
}