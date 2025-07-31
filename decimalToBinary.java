import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input binary number
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();

        // Convert binary to decimal
        try {
            int decimal = Integer.parseInt(binaryStr, 2);
            System.out.println("Decimal value: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number!");
        }

        scanner.close();
    }
}
