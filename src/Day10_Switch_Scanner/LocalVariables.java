package Day10_Switch_Scanner;

public class LocalVariables {
    public static void main(String[] args) {

        // declare variable: DataType variable

        int a = 0;
        if (true){
        System.out.println(a);
        int b = 10;

    }
       // System.out.println(b); We cannot use b coz it is outside its block (if block)
        switch (4){
            case 1:
                int c = 100;
            case 2:
               // System.out.println(c); We CANNOT print c coz it is outside case:1 block
        }

        if (9 > 10){
            int t = 100; // here we can use (t) again coz it is a local variable inside the else if
        }else if (11 > 10){
            int t = 200; // same here
        }else if (12 > 10){
            int t = 300; // same here
        }

      /* System.out.println(t); We CANNOT print any of these (t)s coz they cannot be used outside
      their blocks
       */


    }

}
