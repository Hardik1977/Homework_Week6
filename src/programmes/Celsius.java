package programmes;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Celsius {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius");
        System.out.println("Enter Fahrenheit value");
        double value = scan.nextDouble();
        double value1= (value -32) * 5/9;
        System.out.println("Celsius will be : ");
        System.out.println(Math.round(value1+10.0/10.0));
        scan.close();
    }

}
