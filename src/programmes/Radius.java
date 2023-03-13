package programmes;


 /**Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;
public class Radius {

    public static void main(String[] args) {
        double radius,area;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of the circle:  ");
        radius = scan.nextDouble();
        scan.close();

        area = Math.PI * radius * radius;
        System.out.println("Area of the cercle is : " + area);

    }


}
