package programmes;

import java.util.Scanner;

public class PerimeterOfRectangle14 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter Height 5.6 : ");
        double num1 = in.nextDouble();
        System.out.println("Enter Width 8.5 : ");
        double num2 = in.nextDouble();
        System.out.println("Total Area of Width and Height is: " + (num1*num2));
        in.close();
    }

}
