package Day44_Eceptions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class try_catchBlock {

    public static void main(String[] args) {

        System.out.println("Test stated");
        List <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

      ///  System.out.println(list.get(10));// Unchecked Exception

        try {
            System.out.println(list.get(10));// Unchecked Exception
            System.out.println("try block");

        }catch (IndexOutOfBoundsException exc){ // or we can write the parent name "Runtime Exception or the grandpa name
            // (RuntimeException exc)           so the easiest way is just to write the Granpa's name "Exception"
            // (Exception exc)
            System.out.println("Something went wrong here");// we can add a message to know that the error actually
                                                            // happened here
        }



        System.out.println("Test completed");
    }
}
