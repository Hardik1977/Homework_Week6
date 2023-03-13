package programmes;


import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */
public class MultiplicationTablePrint10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number which multiplication table to display");
        int n = scan.nextInt();
        multiplication(n);
        scan.close();
    }
public static void multiplication(int n) {
        System.out.println(n + "x" + 1 + "=" + n);
            System.out.println(n + "x" + 2 + "=" + n*2);
            System.out.println(n + "x" + 3 + "=" + n*3);
            System.out.println(n + "x" + 4 + "=" + n*4);
            System.out.println(n + "x" + 5 + "=" + n*5);
            System.out.println(n + "x" + 6 + "=" + n*6);
            System.out.println(n + "x" + 7 + "=" + n*7);
            System.out.println(n + "x" + 8 + "=" + n*8);
            System.out.println(n + "x" + 9 + "=" + n*9);
            System.out.println(n + "x" + 10 + "=" + n*10);

    }
}
