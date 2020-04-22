package Day26_MethodOverLoading;

public class MethodOverloading3 {

    public static void main(String[] args) {

        sum(7, 9);
        sum(6,8.6);

        sum (5L,6L);// second method execute coz we can assign long to double but NOT to int

        sum((int)40L, (int)50L);// now the first method execute coz we casted them.

    }

    public static void sum (int a, int b){
        System.out.println(a + b);
    }
    public static void sum (double a, double b){
        System.out.println(a + b);
    }
}
