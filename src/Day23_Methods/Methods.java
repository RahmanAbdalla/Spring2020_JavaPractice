package Day23_Methods;

public class Methods {
    public static void main(String[] args) {

        printHello5Times();
        printHelloUniverse();

    }

    public static void printHello5Times () {

        for (int i=0; i < 5; i++ ){
            System.out.println("Hello World");
        }
    }
    public static void printHelloUniverse(){
        for (int i=0; i < 3; i++ )
        System.out.println("Hello Universe");
    }

}
