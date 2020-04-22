package Day26_MethodOverLoading;

import java.util.Arrays;

public class MethodOverloading2 {
    /*
    first method: print the sum of two int numbers
    second method: print the sum of three int numbers
    third method: print the sum of four int numbers
     */

    public static void main(String[] args) {

        sum(6, 20);
        sum(6, 4, 8);
        sum(4, 7, 10);

        sum(10.4,5.4);

        //it's like array overloaded method, coz we can sort int arr, char arr, and double arr with Arrays.sort method

        int[] arr1 = {4, 2, 1};
        char[] arr2 = {'z', 'f', 'r'};
        double[] arr3 = {4.5, 3.2, 5.9};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3); // same method name, different parameters

    }

    public static void  sum (int a, int b){
        System.out.println(a + b);
    }
    public static void  sum (int a, int b, int c){
        System.out.println(a + b + c);
    }
    public static void  sum (int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }

    public static void sum (double a, double b){
        System.out.println(a + b);
    }
}
