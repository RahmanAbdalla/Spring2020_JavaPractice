package Day24_Methods;

public class ReturnMethods {

    public static void maxNum (int a, int b){

        if (a > b) {
            System.out.println(a);
        }else {
            System.out.println(b);
        }

    }

    public static void main(String[] args) {

      // int a = maxNum(10,20); Wring coz it's void method. we can't assign it again

       int result = Addition(20,30);// here we can reuse the result coz it's NOT void method
        System.out.println(result); // 50

        int result2 = result;
        System.out.println(result2); // 50
    }

    public static int Addition (int a, int b){
       // System.out.println(a+b); we don't use this coz we put it in return below

        return a+b;
    }
}
