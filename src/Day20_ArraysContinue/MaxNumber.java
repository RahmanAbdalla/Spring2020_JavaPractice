package Day20_ArraysContinue;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        // INTERVIEW Question

        Scanner scan = new Scanner(System.in);

        int[] arr= {2, 3, 4, 5, 6, 7, 8, 9};
        int lastIndex= arr.length-1;

        int max= arr[0];
        int min= arr[7];


        for (int i=0; i<=lastIndex; i++){

            if (arr[i] > max){
                max =arr[i];
            }
            if    (arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);


 //  DO THIS ONE YOUR OWN. Using Scanner

        int arr2[] = new int[3];
       int max2 = arr2[0];

        for (int j=0; j <=2; j++){
            System.out.println("Enter three numbers:");
            int num = scan.nextInt();

            arr2[j] =num;

            if (arr2[j] > max2){
                max2=arr2[j]; // compares if the next input number if greater than the one before
            }

        }

       String r = Arrays.toString(arr2);

        System.out.println("Array numbers are: "+arr2[0]+", "+arr2[1]+", and "+arr2[2]);
        System.out.println(r);// we can also show arrays in this way
        System.out.println("Max array is: "+max2);




    }
}
