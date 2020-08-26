package Day22_Arrays_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {

        /*
        3. write a program that can return the number of appearances of "java" and "python"
         anywhere in the sentence (it's similar to the task 97 in repl.it, But this time
         you MUST use arrays and for each loop)
         */

        String sentence = "I like Java and Javascript, Python Python";

        String arr2 [] = sentence.split(" ");

        System.out.println(Arrays.toString(arr2));

        int countJava=0;
        int countPython=0;
        for ( String ocurr: arr2) {

            if (ocurr.contains("Java")){
                countJava++;
             //   ocurr= ocurr.replaceFirst("Java","");coz we use foreach loop then we dont need
                         //this replaceFirst statement coz for each loops ONCE only
            }
            if (ocurr.contains("Python")){
                countPython++;
              //  ocurr = ocurr.replaceFirst("Python","");
            }
        }

        // For Loop
//        for (int i=0; i<arr2.length; i++){
//
//            if (arr2[i].contains("Java")){
//                countJava++;
//            }
//            if (arr2[i].contains("Python")){
//                countPython++;
//            }
//        }

        System.out.println(countJava == countPython);


        System.out.println("Java appears "+countJava+" time(s) in this array.");
        System.out.println("Python appears "+countPython+" time(s) in this array.");



    }
}
