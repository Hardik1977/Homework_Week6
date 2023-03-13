package programmes;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class AreaOfTriangle {
    public static void main(String[] args) {
        int a, b, c, pstg;
        double area;

        Scanner hb = new Scanner(System.in);
        System.out.println("Please enter 3 values for sides : ");
        a = hb.nextInt();
        b = hb.nextInt();
        c = hb.nextInt();
        pstg = (a + b + c) / 2;// PLEASE ENTER 12,14,16 NUMBER FOR TRIAL
        area = Math.sqrt(pstg - a) * (pstg - b) * (pstg - c);
        System.out.println("Area of the Triangle " + area);
        hb.close();
    }
}
