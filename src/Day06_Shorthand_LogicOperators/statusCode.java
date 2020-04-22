package Day06_Shorthand_LogicOperators;
import java.util.*;
public class statusCode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int StatusCode = input.nextInt();

        if (StatusCode==200){
            System.out.println("OK");
        }

        if (StatusCode==201){
            System.out.println("Created");
        }
        if (StatusCode==202){
            System.out.println("Accepted");
        }
        else {
            System.out.println("you number is invalid");
        }


    }
}
