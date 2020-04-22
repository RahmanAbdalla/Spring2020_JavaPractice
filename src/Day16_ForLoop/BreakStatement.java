package Day16_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i=1; i<=5;i++ ){//i: 1,2,3,4,5

          /*  System.out.println("Hello World");  If we put it here it prints 3 times
                coz loop first checks and prints "Hello World" and then checks the break
           */

            if (i==3){
            //    System.out.println("Hi");  We can also add whatever we want before breaking
                break;
            }

            System.out.println("Hello World");// if we put it here it prints 2 times
                                    // coz loop first checks the break then "Hello World"

          //  break; // it stops loop statement no matter how the condition is in the loop

        }

        for (char i = 'a'; i <='z'; i++){
            System.out.println(i); // if we put it here then 'd' is also printed
            if (i =='d'){
                break;
            }
         //   System.out.println(i); but if we pu tit here then 'd' is NOT printed
        }

    }
}
