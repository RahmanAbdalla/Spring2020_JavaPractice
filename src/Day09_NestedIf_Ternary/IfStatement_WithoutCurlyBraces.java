package Day09_NestedIf_Ternary;

public class IfStatement_WithoutCurlyBraces {
    public static void main(String[] args) {

        int number=100;
        if (number%2==0) //{  We can remove " { " coz we have only ONE statement
            System.out.println("Even number");
        //}//
        else  //{ The same here as above one
            System.out.println("Odd number");
        if (9<8) { // if the blocked
            System.out.println("Hello");
            System.out.println("Hi");
            System.out.println("Choni");
        }
    }
}
