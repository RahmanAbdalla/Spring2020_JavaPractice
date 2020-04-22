package Day07_IfStatements;

public class Vote {
    public static void main(String[] args) {

        short age = 18;
        boolean Uscitizen = true;
        boolean eligible = age >= 18 && Uscitizen == true;

        if (eligible){
       // if (eligible){ // or we can do: if (eligible == true)
            System.out.println("You are eligible to vote");
        }
        if (!eligible){ // or we can do: if (eligible == false)
            System.out.println("You are NOT eligible to vote");
        }
    }
}
