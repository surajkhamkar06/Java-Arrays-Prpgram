package package1;
import java.util.Arrays;

public class EasySecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 1, -10, 34, 99};

        Arrays.sort(arr);

        int secondSmallest = arr[1];
        int secondLargest = arr[arr.length - 2];

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}