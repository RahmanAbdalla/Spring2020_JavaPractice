package OfficeHours.Practice_04_15_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NestedLoops2 {
    public static void main(String[] args) {

        int [] []  numbers= {  {5,4,3,2,1}, {10,11,12,13,14,15}, {16,17,18,19,20} };


        Arrays.sort(numbers[0]);//
        System.out.println(Arrays.toString(numbers[0]));

        // print ODD nums, regular loop

        for (int i=0; i < numbers.length; i++){

            for (int k=0; k < numbers[i].length; k++){

                if (numbers[i][k] % 2 == 0){
                    continue;
                }
                System.out.print( numbers[i][k]+" ");
            }
        }
        System.out.println();

        // print EVEN nums, forEach loop

        for (int [] each1Darr : numbers){

            for (int eachElement : each1Darr){
                if (eachElement% 2 !=0){
                    continue;
                }
                System.out.print(eachElement+" ");
            }
        }



    }
}
