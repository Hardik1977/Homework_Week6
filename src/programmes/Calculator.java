
package programmes;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

public class Calculator {
    static String result;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int a = scan.nextInt();
        System.out.println("please enter Second number: ");
        int b = scan.nextInt();


        Calculator scanner = new Calculator();
        add();
        sub();
        scanner.mul();
        scanner.div();
        int ans = (a + b );//Addition stores in ans
        int ans1 = (a - b );//Substraction stores in ans1
        int ans2 = (a * b );//Multiplication stores in ans2
        int ans3 = (a / b );//Devision stores in ans3

        System.out.println("Addition is : " + ans); //Print statement
        System.out.println("Substraction is : " + ans1);// Print statement
        System.out.println("Multiplication is : " + ans2);// Print statement
        System.out.println("Division is : " + ans3);// Print statement

        scan.close();
    }
    public static void add() { int a;
    }
    public static void sub() { int b;
    }
    public void mul() { int a;
    }
    public void div() { int b;
    }
}



