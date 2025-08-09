package package1;

public class FindDuplicates 
{
    public static void main(String[] args) 
    {
        int[] numbers = {4, 2, 7, 4, 8, 2, 9, 7};

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break; 
                }
            }
        }
    }
}
