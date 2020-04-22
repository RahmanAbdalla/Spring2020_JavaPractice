package Day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {

        int[]arr = {1,2,3};

        String r = Arrays.toString(arr);// converting arrays to string
        System.out.println(r);

        String names[] = {"Rahman", "Barzy", "Adil"};
        System.out.println(names.length);


    //    System.out.println(names);//we CANNOT do it this way coz it shows us some hash tags

        System.out.println(Arrays.toString(names));// this one shows EXACTLY how the array is

        double[] num = {10,20,30,40,50};
        System.out.println(Arrays.toString(num));// shows [10.0,20.0,30.0,40.0,50.0]

        System.out.println(num[0]);// this still returns double coz it shows original value







    }

}
