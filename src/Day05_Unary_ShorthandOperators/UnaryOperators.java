package Day05_Unary_ShorthandOperators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = 10; // positive 10
        int b = +a; // positive 10
        System.out.println(a); // result 10
        System.out.println(b); // result 10

        int a2 = -10;
        boolean result1 = a2 > 0; // false
        boolean result2 = a2 < 0; // true

        System.out.println(result1);
        System.out.println(result2);

        int x1 = -10;
        int y1 = - x1; // result is positive 10 coz negative times negative is positive
        boolean result = y1<9;
        System.out.println(y1);
        System.out.println(result);

        int x2 =  +20;
        int y2 = - x2; // result -20
        System.out.println(y2);

        int x3 = 20;
        int y3 = + x3;
        System.out.println(y3); // result 20


        int z = 100;
        System.out.println(++ z); // 101, coz pre increment increases the value immediately
        System.out.println((z)); // 101,

        int P = 100;
        System.out.println(P ++); // 100, first passes the current value
        System.out.println(P); // 101, then add one

    }
}
