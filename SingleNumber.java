package package1;

public class SingleNumber
{
    // Method to find the single number
    public static int findSingleNumber(int[] nums) 
    {
        int value = 0;
        for (int i = 0; i < nums.length; i++)
        {
            value = value ^ nums[i]; // XOR operation
        }
        return value;
    }

    // Main method to run the program
    public static void main(String[] args)
    {
        int[] nums = {2, 3, 5, 4, 5, 3, 2}; // Example input
        int result = findSingleNumber(nums);
        System.out.println("Single number is: " + result);
    }
}