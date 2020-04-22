package Day10_Switch_Scanner;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {
        char ch= 'a';

        switch (ch){
            case 'A':
                System.out.println("This is A");
                break;
            case 'B':
                System.out.println("This is B");
                break;
            case 'C':
                System.out.println("This is C");
                break;
            case 'D':
                System.out.println("This is D");
                break;
            case 'E':
                System.out.println("This is E");
                break;

            default:
                System.out.println("not found");
                break;
        }
    }
}
