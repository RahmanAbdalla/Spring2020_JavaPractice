package Day22_Arrays_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class evenNumbers {
    public static void main(String[] args) {


        /*
        Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement
         */

        int [] numbers = new int[100];

        for (int i=0; i < numbers.length; i++){

            numbers[i] = i+1;
        }

        for (int evenNum : numbers) {

            if (evenNum % 2 != 0) {
                continue;
            }
            System.out.print(evenNum+" ");

        }

        System.out.println("================================");
        /*
         write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
         */
        int [] num = {1,2,3,4,5,6,7,8,9,10,11};

        int countEven=0;
        int countOdd=0;

        for (int each: num){

          /*  if (each % 2 ==0){

            countEven++;

            }else {
                countOdd++;
            }

           */

          // we can also do it with continue like below:
          if (each % 2 ==0){

              countEven++;
              continue;
          }
          countOdd++;
        }

        System.out.println("Even numbers: "+countEven);
        System.out.println("Odd numbers: "+countOdd);
    }
}
