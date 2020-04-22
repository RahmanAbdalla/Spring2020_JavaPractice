package OfficeHours.Practice_03_18_2020;

public class ShortHandOperator_Practice {
    public static void main(String[] args) {

                // +=: addition assignment

        int a = 100;
        // a = a + 200; instead of this we can do the following
        a += 200;
        System.out.println(a); // a = 300

        a += 200 * 3; // now a = 300 NOT 100, so (a) becomes 900
        System.out.println(a); //  900



                 // -= subtraction assignment
        // a = a - 400  instead of this We can do this...
        a -= 400; // a become 500
        System.out.println(a);

        int b = 300;
        b -= 3 * 40;  // 300 - 120 = 180
        System.out.println(b);




                 // *= multiplication assignment
        int x = 5;
        // x = x * 3  instead of this We can do this...
        x *= 3;
        System.out.println(x); // 15

        x *= 2+1;
        // x *= 3;     x = x * 3 ==> 45
        System.out.println(x);


                // /=: Division assignment
        int n = 900;
        // n = n / 3   instead of this We can do this...

        n /= 3;
        System.out.println(n); //300

        n /= 3 * 5; // n = n / 15 ==>
        System.out.println(n);


                    // %=: Remainder assignment
        // remainder formula: numerator - (denominator - whole number of result)

        int c = 10;
        // c = c % 3; // 11     instead of this We can do this...
        c %= 3; // 1
        System.out.println(c);

        int y = 300;
        y %= 3*5;
        // y %=15 ==> y = y%15 ==> y = 0
        System.out.println(y);

        int t = 400;
        t %= 10*2;
        // t %= 20;  ==> t = t % 20 ==> t = 0
        System.out.println(t);







    }
}
