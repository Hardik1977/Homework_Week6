package programmes;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class AddMulSubDivandRemainder18 {
// Variable define
    public static void main(String[] args) {
        int a = 124;
        int b = 24;
// print statement and calculation (User input two numbers)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        a = scanner.nextInt();
        System.out.println("Input second number: ");
        b = scanner.nextInt();
        System.out.println("125+24 = " + (a + b));
        System.out.println("125-24 = " + (a + b));
        System.out.println("125x24 = " + (a * b));
        System.out.println("125/24 = " + (a / b));
        System.out.println("125 mod 24 = 5" );
        scanner.close();
    }


}
