package programmes;

public class SpecifiedExpressions {

    public static void main(String[] args) {

        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;
        System.out.println("Test data : ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) ");
        System.out.println("Expected output :" + (a * b - b * b) / (c - d));
       //System.out.println("2.138888888888889");

    }


}
