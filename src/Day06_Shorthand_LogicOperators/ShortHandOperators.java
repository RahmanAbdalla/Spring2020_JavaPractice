package Day06_Shorthand_LogicOperators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int x = 20;
        x +=10; // x = x+10 = 300
        System.out.println(x);

        x +=60; // x = x + 60 = 90
        System.out.println(x);

        String schoolNmae = "CyberTek";
        schoolNmae += 12345; // schoolName = schoolName + 12345
        System.out.println(schoolNmae);

        System.out.println('a'+'b'); // 97 + 98 ==> 195

        char ch1 = 'a'; // 97
        ch1 += 'b'; // 98
        //char ch1 = 195; the compiler adds up both to get 198, then show character of 195 coz data type is char

        System.out.println(ch1); // Ã is the corresponding character of 198

        int num = 'z'; // 122
        num += 'x'; // 120   ==> 122 + 120 = 242
        System.out.println(num); // 242, not character coz int takes numbers only


        int A = 100;
        A -= 90; // 100 - 90 = 10
        System.out.println(A); // A = 10
        int B = 200;
        B -= A; // B = B - A ==> 200 - 10 = 190
        System.out.println(B); // B = 190

        int a = 2;
        a *= 3; // a * 3 = 6
        System.out.println(a);

        int b = a * 10; // b = a(6) * 10 = 60
        System.out.println(b); // 60
        System.out.println(a); // 60

        int a1 = 100;
        int b1 = (a1 *= 2) + ++a1;
        // b1 = 200 + 201
        // b1 = 401
        System.out.println(b1);

        int x1 = 10;
        int y = x1 += 10*2; // 30
        // y = x1 + 20
        // y = 10 + 20 = 30
        System.out.println(y);

        int q = 20;
        int p = q *=20*3;
        // q = 20 * 60 = 1200
        System.out.println(p); // 1200

        int num1 = 300;
        num1 /= 2; // nim1 = num2 / 2
        System.out.println(num1);

        int num2 = 400;
        num2 /= 20 + 10; // num2 = num2 / 30 ==> first u need to calculate the right hand then do the division
                        // num2 = 400 / 30 = 13.123
                        // num2 = 13 coz int takes whole num only
        System.out.println(num2);

        int num3 = 300;
        num3 %= 10 +20; // num3 %= 30
                        // num3 = num3 % 30
                        // num3 = 300 % 30 ==> 0
        System.out.println(num3);

        int n1 = 400;
        n1 %= 3*5; // n1 %= 15
                    // n1 = n1 % 15
                    // n1 = 400 % 15 = 10
        System.out.println(n1);






    }
}
