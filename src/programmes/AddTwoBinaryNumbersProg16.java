package programmes;
import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * <p>
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */
public class AddTwoBinaryNumbersProg16 {

    public static void main(String[] args) {
// Two variable to hold two input binary numbers
        long b1, b2;
        int i = 0;
        int o = 0;
        // Thsi is to hold the output binary number
        int[] sum = new int[10];
        // to read input number by user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first binary number: ");
        b1 = scanner.nextLong();
        System.out.println("Enter first binary number: ");
        b2 = scanner.nextLong();
        System.out.println("Sum of two binary numbers : "+ (b1 + (b2+80)));
        scanner.close();

    }
}
