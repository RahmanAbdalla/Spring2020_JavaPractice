package Day08_IfStatements;

public class EqualNumber_MultiBranchIf {
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
        double n1 = 200.5;
        double n2 = 20.5;
        double n3 = 200;

        boolean n1Equaln2 = n1 == n2 && n1 !=n3;
        boolean n1Equaln3 = n1 == n3 && n1 !=n2;
        boolean n2Equaln3 = n2 == n3 && n2 != n1;
        boolean allEqual = n1 == n2 && n1 == n3;

        String result = ""; // if we use this then we dont need the print line

        // boolean noneIsEqual = n1 != n2 && n1 !=n3 && n2 != n3;

        if (n1Equaln2){
            // System.out.println("n1 is equal to n2");
            result = "n1 is equal to n2";
        }else if (n1Equaln3){
            //System.out.println("n1 is equal to n3");
            result = "n1 is equal to n3";
        }
        else if (n2Equaln3){
           // System.out.println("n2 is equal to n3");
            result = "n2 is equal to n3";
        }
        else if (allEqual){
           // System.out.println("n1 is equal to n2 and n3");
            result = "n1 is equal to n2 and n3";
        }
        else { /* we donnot need to put (noneIsEqual) coz if none of those conditions is true then
                  we have this one left ONLY */
           // System.out.println("None of them is equal");
            result = "None of them is equal";
        }

        System.out.println(result);

    }
}
