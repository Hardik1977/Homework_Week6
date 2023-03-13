package programmes;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */


public class AverageProg13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter first number : ");
        int num1 = in.nextInt();// user input stores at num1
        System.out.println("Enter second number : ");
        int num2 = in.nextInt();// user input stores at num2
        System.out.println("Enter third number : ");
        int num3 = in.nextInt();// user input stores at num3
        System.out.println("Average of three number is: " + (num1 + num2 + num3) / 3);
    }
}

