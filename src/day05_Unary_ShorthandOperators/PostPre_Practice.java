package day05_Unary_ShorthandOperators;

public class PostPre_Practice {
    public static void main(String[] args) {


        int a = 50;// 49
        a = --a + a++ + a -- + a ++;
        // 49 + 49 + 50 + 49 = 197
        double g = a/2.0  +  a++  +  --a *  a * 3  + 100;
        System.out.println(g);

        int x = 4;
        int y = x * 4 - x++;
              // 16 - 4 = 12
        System.out.println(y);

        int b = 1; // 0
        b = - b -- + b++  /  - b--  * --b;
        // b = -1  + 0  / -1   *  -1 =
        // -1 + 0 * -1
        // -1 + 0 = -1
        System.out.println(b);



    }


}
