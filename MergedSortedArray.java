package package1;

import java.util.Arrays;

class MergedSortedArray 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) 
        {
            if (nums1[p1] > nums2[p2])
            {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) 
        {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) 
    {
        MergedSortedArray merger = new MergedSortedArray();

        // nums1 has enough space to hold elements from nums2
        int[] nums1 = new int[9];
        nums1[0] = 1;
        nums1[1] = 3;
        nums1[2] = 5;
        nums1[3] = 7;
        nums1[4] = 9;
        int m = 5;

        int[] nums2 = {2, 4, 6, 8};
        int n = nums2.length;

        merger.merge(nums1, m, nums2, n);

        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}