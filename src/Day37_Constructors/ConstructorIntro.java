package Day37_Constructors;

public class ConstructorIntro {

   // public method(){ } // ERROR coz constructor name MUST be same as class name
    public ConstructorIntro(int a){ // its execution depends on the creation of the obj

        System.out.println("Constructor with argument");
    }

    public ConstructorIntro(){
        this(10);
        System.out.println("Test");
    }



    public static void main(String[] args) {

    //    ConstructorIntro obj = new ConstructorIntro(); we MUST use the current constructor

        ConstructorIntro obj = new ConstructorIntro(10);
        ConstructorIntro ob2 = new ConstructorIntro();

    }
}
