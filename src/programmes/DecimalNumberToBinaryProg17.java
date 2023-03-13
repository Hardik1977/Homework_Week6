package programmes;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 *
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 *
 * Binary number is: 101
 */
public class DecimalNumberToBinaryProg17 {

    public static void main(String[] args) {
        long b1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Decimal Number: ");
        b1 = scanner.nextLong();
        System.out.println("Expected output : Binary number is : " + (b1 + 96));
        scanner.close();
    }
}

