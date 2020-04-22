package Day10_Switch_Scanner;

public class NumberToWord {
    public static void main(String[] args) {

        /*
        write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
				DO NOT USE IF STATEMENTS
         */

        int n = 10;

        String let = " ";

       let = (n==1)?"One":(n ==2)?"Two":(n==3)?"Three":(n==4)?"Four":(n==5)?"Five":(n==6)?"Six"
               :(n==7)?"7":(n==8)?"8":(n==9)? "Nine" : "Invalid";

       System.out.println(let);


    }
}
