package Day36_StaticBlock;

public class StaticBlock {

    //The compiler always runs the static method first and then the Main Method

    public static void main(String[] args) {
        System.out.println("Hello Cybertek");

        StaticBlock obj = new StaticBlock();
        obj.instanceMethod();

        customMethod();

    }

    public  void instanceMethod(){ // this is not going to printed coz we have to call it through the Main Method
        System.out.println("Hey");     // like in line 9
    }

    public static void customMethod(){
        System.out.println("Custom method");
    }


    static {
        System.out.println("This is a static method, so it is printed out first");

    }
}
