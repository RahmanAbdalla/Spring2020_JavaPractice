package Day08_IfStatements;

public class equalNumbers {
    public static void main(String[] args) {
        /*
        1.  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
         */

        double n1 = 500;
        double n2 = 500;
        double n3 = 200;

        /*
        boolean n1n2Equal= n1==n2;
        boolean n1n3Uneq = n1!=n3;
        boolean n2n3Uneq = n2!=n3;
        */


        boolean n1Equaln2 = n1 == n2 && n1 !=n3;
        boolean n1Equaln3 = n1 == n3 && n1 !=n2;
        boolean allEqual = n1 == n2 && n1 == n3;
        boolean n2Equaln3 = n2 == n3 && n2 != n1;
        boolean noneIsEqual = n1 != n2 && n1 !=n3 && n2 != n3;

        // we can also do this for the last boolean. Like this:
        boolean noneEqual = n1Equaln2 ==false && n1Equaln3==false && n2Equaln3 == false;
        // Or we can do this too: !n1Equaln2          !n1Equaln3           !n2Equaln3

        if (n1Equaln2){
            System.out.println(n1+" is equal to "+n2);
        }
        if (n1Equaln3){
            System.out.println(n1+" is equal to "+n3);
        }
        if (n2Equaln3){
            System.out.println(n2+" is equal to "+n3);
        }
        if (allEqual){
            System.out.println(n1+" is equal to "+n2+" and "+n3);
        }
        if (noneIsEqual){
            System.out.println("None of them are equal");
        }






    }
}
