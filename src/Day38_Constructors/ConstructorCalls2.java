package Day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){// we can call this default cons. method in other const. methods at line 10 and 15
        System.out.println("Default constructor");

    }

    public ConstructorCalls2(int a){
        this();// this is the default constructor method at line 5
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str){
        this(15);
        System.out.println("Constructor with string argument");

    }

    public static void main(String[] args) {

        ConstructorCalls2 obj = new ConstructorCalls2();// this prints the first default constructor at line 5
        System.out.println("=================");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);//this prints the second cons.method at line 10, but it firsts print line 11, then 12
        System.out.println("=================");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Hello");//     this prints: first: line 11, then 12, then 17

    }
}
