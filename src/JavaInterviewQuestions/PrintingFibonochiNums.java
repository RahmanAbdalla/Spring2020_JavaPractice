package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintingFibonochiNums {

    public static void main(String[] args) {


        int n = 8;

      fibonochi(n);

    }


    public static void fibonochi(int num) {
        int n1 = 0, n2 = 1, n3;



        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (int i = 2; i < num; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }






}
