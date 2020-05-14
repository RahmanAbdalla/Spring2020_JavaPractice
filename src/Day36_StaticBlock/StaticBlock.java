package Day36_StaticBlock;

public class StaticBlock {

    //The compiler always runs the static method first and then the Main Method

    public static void main(String[] args) {
        System.out.println("Hello Cybertek");
    }

    public static void customMethod(){ // this is not printed coz we have to call it through the Main Method
        System.out.println("Hey");
    }


    static {
        System.out.println("This is a static method, so it is printed out first");

    }
}
