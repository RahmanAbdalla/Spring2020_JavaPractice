package OfficeHours.Practice_04_15_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {

        char arr2D [] [] = {  {'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'} };


        for (int k=0; k < arr2D.length; k++) {// k = index nums of ID array
            //arr2D[0] elements
            for (int i = 0; i < arr2D[k].length; i++) {// i = index nums of ID elements
                System.out.println(arr2D[k][i]);
            }
        }

        System.out.println("======== forEach loop ========");
        for (char[] each1DArray : arr2D){

            for (char eachElement : each1DArray){
                System.out.println(eachElement);
            }
        }
    }
}
