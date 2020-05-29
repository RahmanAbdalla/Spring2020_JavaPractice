package Day44_Eceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Test";
        System.out.println(str);

        try {
            System.out.println(str.charAt(-1));
            System.out.println("Error fixed in Try Block");
        }catch (Exception exc){ // we can also get the description (message) of the Exception like this:
            String description = exc.getMessage(); //PRINTS ==>  String index out of range: -1
            System.out.println(description);
        }

        System.out.println("=================================");

       // System.out.println(100/0);

        try {
            System.out.println(100/0);
            System.out.println("Fixed in Try Block");

        }catch (Exception exc){
            String description = exc.getMessage();
            System.out.println(description); // PRINT ==>  / by zero
        }

        System.out.println("Completed");
    }
}
