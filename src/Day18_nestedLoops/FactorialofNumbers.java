package Day18_nestedLoops;

import java.util.Scanner;

public class FactorialofNumbers {
    public static void main(String[] args) {

        int a =0;

        while (a <= 6){
            a+=2;
        }
        System.out.println(a);


        /*
        write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
         */

        Scanner scan = new Scanner(System.in);

        long num = scan.nextLong();

       long factor=1;
        while (num > 0){

           factor *= num;
            num--;
        }
        System.out.println(factor);


    }
}
