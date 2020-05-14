package Day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3 (){
        this(3);
        System.out.println("default");

    }

    public ConstructorCalls3 (int a){
     //   this(); we CANNOT swap constructors coz here ConstructorCall3 at line 5 already contains (const. int)
    System.out.println("int argument");

    }

    public ConstructorCalls3 (String str){
       this();
    }



    public static void main(String[] args) {

        ConstructorCalls3 obj1 = new ConstructorCalls3();
    }
}
