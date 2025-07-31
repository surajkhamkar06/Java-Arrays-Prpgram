import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binary = "";

        if (decimal == 0) {
            binary = "0";
        } else {
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary = remainder + binary;  // prepend to get correct order
                decimal = decimal / 2;
            }
        }

        System.out.println("Binary representation: " + binary);
        scanner.close();
    }
}

