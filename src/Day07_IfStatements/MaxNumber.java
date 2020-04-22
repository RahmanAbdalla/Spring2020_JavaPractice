package Day07_IfStatements;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class MaxNumber {
    public static void main(String[] args) {
        /*
        2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
         */
        double num1 = 34.4;
        double num2 = 49;
        double num3 = 90;

        boolean MaxNumber1 = num1>num2 && num1>num3;
        boolean MaxNumber2 = num2>num1 && num2>num3;
        boolean MaxNumber3 = !MaxNumber1 && !MaxNumber2; //we can also use this (!MaxNumber1...)

        if (MaxNumber1){
            System.out.println(num1+" is greater than "+num2+ " and "+ num3);
        }
        if (MaxNumber2){
            System.out.println(num2+" is greater than "+num1+ " and "+ num3);
        }
        if (MaxNumber3){
            System.out.println(num3+" is greater than "+num1+ " and "+ num2);
        }

                        // OR
        if (num2>num1 && num2>num3){
            System.out.println(num2+" is greater than "+num1+ " and "+ num3);

        }


    }
}
