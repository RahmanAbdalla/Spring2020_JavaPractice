package Day38_Constructors;

public class Test {


    public Test(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance block");
    }


    public static void main(String[] args) {


        new Test(); // instance, constructor
        System.out.println("Main method ");

        //    new Test(); //instance, constructor

    }

    static{
        System.out.println("Static block");
    }

}
