package Day44_Eceptions;

public class try_catchBlock2 {
    public static void main(String[] args) {

        System.out.println("Hello");

        try {
            Thread.sleep(2000); // this delays printing "World" for 2 seconds.
            System.out.println("Error fixed here in (Try Block)");
        }catch (Exception e){
            System.out.println("Error fixed here in (Try Block)");
        }

        System.out.println("World"); // is printed after 2 seconds
    }
}
