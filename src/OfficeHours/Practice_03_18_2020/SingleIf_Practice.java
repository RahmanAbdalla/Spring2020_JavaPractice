package OfficeHours.Practice_03_18_2020;

public class SingleIf_Practice {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;

       /*
       boolean aGreater = a > b;
       boolean bGreater = b > a;
       boolean aEqualB = a==b
                OR
       boolean aEqualB =  aGreater == false && bGreater == false
                OR
       boolean aEqualB  =  aGreater == bGreater
        */

       // We can even do it without boolean expressions above. Like this:
        if (a > b ){
            System.out.println(a+ " is greater than "+b);
        }
        if (b > a ){
            System.out.println(b+ " is greater than "+a);
        }
        if (a == b ) {
            System.out.println(a + " is equal to " + b);
        }



    }
}
