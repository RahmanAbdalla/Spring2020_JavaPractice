package Day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {

        int number = 100;

        boolean evenNum= number % 2 ==0;


        if (evenNum){
            System.out.println(number+" is an even number");
        }
        else {
            System.out.println(number+" is an odd number");
        }

        int age = 30;

        boolean eligibleToBuy = age >21;

        if (eligibleToBuy){
            System.out.println("Drink your alcohol like a donkey");
        }else {
            System.out.println("Go home goat");
        }

        boolean testedPositiveForCorona = false;

        if (testedPositiveForCorona){
            System.out.println("Stay home");
        }else {
            System.out.println("You're lucky");
        }
    }
}
