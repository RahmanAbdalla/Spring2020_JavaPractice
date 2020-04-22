import java.lang.invoke.SwitchPoint;
import java.util.*;
public class Me01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Name;
        int Age;
        String MaritalStatus;
        String Country;
        String Job;
        String Answer;
        int n = 255;
        int n1=0;


        System.out.println("What's your name?");
        Name = input.next();
        System.out.println("How old are you?");
        Age = input.nextInt();
        System.out.println("What's your marital status?");
        MaritalStatus = input.next();
        if (MaritalStatus.equalsIgnoreCase("Married")){
            System.out.println("How many kids do you have?");
            int Kids;
            Kids = input.nextInt();
            System.out.println("Where are you from?");
            Country = input.next();
            System.out.println("What's your job?");
            Job = input.next();
            System.out.println("The information you entered is:\n");
            System.out.println(Name+"\n"+Age+"\n"+MaritalStatus+"\n"+Country+"\n"+Job);
        }
        else{
        System.out.println("Where are you from?");
        Country = input.next();
        System.out.println("What's your job?");
        Job = input.next();
        System.out.println("The information you entered is:\n");
        System.out.println(Name+"\n"+Age+"\n"+MaritalStatus+"\n"+Country+"\n"+Job);}
        System.out.println("Is that correct? Type: \'Yes or No\'");
        boolean answer = input.nextLine().toLowerCase().startsWith("y");
        Answer = input.next();
        System.out.print("Do you want to play a simple Math game " +Name);
        System.out.println("?");
        System.out.println("Type \"Y\" or \"N\"");
        Answer = input.next();
        if (Answer.equalsIgnoreCase("y")){

            System.out.println("What's 105 +150?...");
            System.out.print("Please write you answer here:");

             n1  = input.nextInt();

        }if (n1==n){
            System.out.println("congrats \"GENIUS\"");
        }else {
            System.out.println("Sorry \"STUPID\"");
            /* I get the same message (Congrats "Genius") either if
            the answer is 255 or any other number. WHY?
             */
        }

        System.out.println("Are you looking to rent an apartment?");
        Answer = input.next();
        if (Answer.equalsIgnoreCase("y")){
            System.out.println("What type of apartment are you looking for?\nSelect one from the list");
            System.out.println("1 bedroom\n2 bedrooms");
        }
        int room=0;
        switch (room){
            case 1:
                System.out.println("1 bedroom, 1 bath (starting at: $900\n" +
                        "1 bedroom, 1.5 bath (starting at: $1000");
                break;
            case 2:
                System.out.println("2 bedrooms, 1 bath (starting at: $1100\n" +
                        "2 bedrooms, 1.5 bath (starting at: $1300");
                break;

        }                Answer = input.next();




        System.out.println("     THANK YOU");
    }

}