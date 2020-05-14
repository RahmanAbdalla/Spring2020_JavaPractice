package Day35_Static;

import java.util.Scanner;

public class staticPractice {

    // when to use static variable instead of instance

    static Scanner scan = new Scanner(System.in);// in order we can use this Scanner every where then we declare it as
                                                        // static, unless we have error in the static method

    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in); we don't need to declare a new scanner again
        int sum=0;
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        sum+= num1+num2;
        System.out.println("Sum is: "+sum);


        staticPractice obj = new staticPractice();
        obj.method1();

    }

    public void method1 (){

     //   Scanner scan = new Scanner(System.in);  we don't need to declare a new scanner again
        int sum=0;
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        sum+= num1+num2;
        System.out.println("Sum is: "+sum);
    }
}
