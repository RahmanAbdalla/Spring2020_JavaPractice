package Day04_JavaRecap;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(9.5 + 3); // 12.5
        System.out.println(20.5f - 10); // 10.5
        System.out.println(3 * 5.5);// 16.5

        //2.5
        System.out.println(10 / 4); // 2, coz int only accepts whole number

        System.out.println(10.0 / 4); //2.5
        System.out.println(10 / 4.0); //2.5

        double a1 = 10/4; /* a1 = (2) NOT (2.5)coz int only takes whole num, but when you print it out

                             it becomes 2.5 coz the double takes decimal*/
        System.out.println(a1);

        double a2 = 10L / 4; // a2 = L2; ==> 2.0. Same as above
        System.out.println(a2);

        double a3 = 10 / 4f; // result is 2.5 not 2 coz it is already float num
        System.out.println(a3);

        double a4 = 10 / 4.0; // result is 2.5 not 4 coz second num is already decimal num
        System.out.println(a4);

        // System.out.println(9 / 0);

    }
}
