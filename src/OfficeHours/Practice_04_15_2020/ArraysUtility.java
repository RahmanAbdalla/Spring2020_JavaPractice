package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        /*
        Arrays.sort(): sorts the array in Ascending order
        Arrays.equal():
        Arrays.deepToString()
        Arrays.toString
         */

        int [ ] arr = {9,10,4,11,15,3,6,-1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int [] salaries = { 100000, 200000, 345, 94443, 2495200};
        int length = salaries.length;
        int lastIndex = length-1;
        Arrays.sort(salaries);

        System.out.println("Minimum salary is: "+salaries[0]);
        System.out.println("Maximum salary is: "+salaries[lastIndex]);//this
        System.out.println("Maximum salary is: "+salaries[salaries.length-1]);//Or this one



    }
}
