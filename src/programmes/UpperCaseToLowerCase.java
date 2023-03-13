package programmes;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */


public class UpperCaseToLowerCase {
private static Scanner sc;

    public static void main(String[] args) {
        String uprstr;
        sc=new Scanner(System.in);
        System.out.println("\nEnter Uppercase String to convert lowercase: ");
        uprstr = sc.nextLine();
        String uprstr1 = uprstr.toLowerCase();
        System.out.println("\nThe Lowercase String = " + uprstr1);
        sc.close();


    }
}
