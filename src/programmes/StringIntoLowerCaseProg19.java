package programmes;
/**
 * 19. Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;

public class StringIntoLowerCaseProg19 {
    //make a private static method
    private static Scanner sc;

    public static void main(String[] args) {
        //create a String and new called scanner obj
        //store user input into lorstr
        //create new string and user input into lowercase storing in lorstr1
        //print output
        String lorstr;
        sc = new Scanner(System.in);
        System.out.println("\nEnter Uppercase String to convert into lowercase : ");
        lorstr = sc.nextLine();
        String lorstr1 = lorstr.toLowerCase();
        System.out.println("\nOutput = " + lorstr1);
        sc.close();
    }

}
