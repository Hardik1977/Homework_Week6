package programmes;

public class JaveProgrammes3 {
    static int a = 25;
    int b = 25;

    public static void main(String[] args) {
        JaveProgrammes3 obj = new JaveProgrammes3();
        obj.instance();
        declare();
    }
    public void instance() {
        JaveProgrammes3 obj1 = new JaveProgrammes3();
        System.out.println(obj1.a);
        System.out.println(b);
    }
    public static void declare() {
        System.out.println(a);
        JaveProgrammes3 obj2 = new JaveProgrammes3();
        System.out.println(obj2.b);

    }


}



