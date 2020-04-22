package Day24_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import Resourses.Library;

public class Test {
    public static void main(String[] args) {

        String str = "Cybertek";

        String rev = Library.reverse2(str);
        System.out.println(rev);

        // to know if str is palindrome or not
        System.out.println(str.equalsIgnoreCase(rev));

        int [] arr = {10000, 5544, 433422, 506505, 333};
        //sort this array in descending order
        arr = Library.sortDescending(arr);
        System.out.println(Arrays.toString(arr));




    }

}
