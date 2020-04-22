package Day24_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TasksFromYesterday {

    public static void main(String[] args) {
        int [] arr = {7,9,4,5,2,6,1,3,23,-2, 14,50};
        maxArr(arr);
        minArr(arr);

        //we can use these method again for other given arrays
        int [] arr2 = {100,34,67,90,44,80,7};

        minArr(arr2);
        decendArr(arr2);

    }

    public static void maxArr (int []array){
        Arrays.sort(array);
           System.out.println("Maximum array is: "+array[array.length-1]);

    }

    public static void minArr (int []array){
        Arrays.sort(array);
        System.out.println("Minimum array is: "+array[0]);

    }

    public static void decendArr (int []array){

        Arrays.sort(array);
        for (int i=array.length-1; i >=0; i--){
            System.out.print(array[i]+" ");
        }
    }

    }
