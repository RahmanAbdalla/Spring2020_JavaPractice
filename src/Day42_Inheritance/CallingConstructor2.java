package Day42_Inheritance;


import Day38_Constructors.ConstructorCalls2;

class Test {

    public Test (int a){
        this(5.4);
        System.out.println("A");
    }                               // we can call either of these const in the subclass
    public Test (double a){
        System.out.println("C");
    }
}



public class CallingConstructor2  extends Test{

    public CallingConstructor2(){
      //  this(10); ERROR coz this() keyword is used to call constructor in the same class
        super(10); //  CA       super() keyword is used to call constructor from another class
        System.out.println("B"); //B

    }

    public static void main(String[] args) {

        Test obj1 = new Test(12); // CA

        CallingConstructor2 obj2 = new CallingConstructor2(); // CAB

    }



}
