package Day48_Abstraction;

interface P{

    void method1();
}

interface Q{
    int method2();
}


abstract class R{
    abstract void method3();
}


public class extends_implements2 extends R implements P, Q { //in such case extends keyword must come first


    public static void main(String[] args) {

       // R obj1 = new R(); can't create object coz abstract class is NOT concrete
      //  Q obj2 = new Q(); can't create object coz: 1- interface doesn't have constructors
                                                //   2- interface is not class, and obj comes from class
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }
}
