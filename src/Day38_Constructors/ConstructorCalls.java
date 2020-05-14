package Day38_Constructors;

public class ConstructorCalls {

    /*constructors can also call methods,but calling constructor method from other methods is different.we have two ways
        1- calling constructor method through another constructor method, but we MUST use " this() " keyword
        2- Calling constructor MUST be at the very beginning of the other method in which we call it
        3- Each constructor can call ONLY ONE const. method
     */

    public ConstructorCalls(){
        method1();
        method2();
    }

    public ConstructorCalls(int a){
        this(); // we called ConstructorCalls() at line 9
    }

    public static void main(String[] args) {


    }

    public static void method1(){


    }

    public void method2(){

        method1();
     //   ConstructorCalls(); We CANNOT call constructor methods in other methods
    }
}
