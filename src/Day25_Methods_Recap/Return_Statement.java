package Day25_Methods_Recap;

public class Return_Statement {

    public static void main(String[] args) {

      //  method1();
       // System.out.println("Hello World");// this still prints out coz the return method only exits method 1 below

        method2();
        System.out.println("Hello");

    }

    public static void method1(){
        if (10 > 9){// we can use return method in VOID, but ONLY when we use that return to exit the statement
            return;
        }
        System.out.println("Hello Cybertek");
    }

    public static void method2() {
        if (10 > 9) {
            System.exit(0);// this one will exit the entire program once it gets executed
        }
        System.out.println("Hello Rahman");
    }
}
