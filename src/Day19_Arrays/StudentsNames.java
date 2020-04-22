package Day19_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StudentsNames {
    public static void main(String[] args) {
        /*
          // write a program that asks "enter a name" 10 times,
          and store each of the names in the array students
         */

        Scanner scan = new Scanner(System.in);
        String names="";
        String allNames="";

        String[] students = new String[10];

        for (int i=0; i <=9; i++) {
            System.out.println("Type a name:");
            names = scan.next();
          //OR  allNames+=names;

            students[i]=names+" ";
        }
        System.out.println(students[5]);
        System.out.println(students[8]);
        System.out.println(students[1]);
        System.out.println(Arrays.toString(students));

    }
}
