package Day16_ForLoop;

public class OddDivisibleBy3And5 {
    public static void main(String[] args) {
/*
write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5
 */

        // ODD numbers divisible by 3 & 5

        for (int i=3; i<=100; i+=2) {
            if (i%2 !=0){

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("");


        // EVEN numbers divisible by 3 & 5
        for (int m=2; m<=100; m+=2 ){
            if (m%2 ==0){
            if (m%3==0 && m%5==0) {
                System.out.print(m+" ");
            }
            }
        }

        }

}
