package package1;

public class ArrayPalindrome 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 2, 1}; 

        boolean palindrome = true;

        for (int i = 0; i < arr.length / 2; i++) 
        {
            if (arr[i] != arr[arr.length - 1 - i]) 
            {
                palindrome = false;
                break;
            }
        }

        if (palindrome) 
        {
            System.out.println("Palindrome Array");
        } else {
            System.out.println("Not Palindrome Array");
        }
    }
}
