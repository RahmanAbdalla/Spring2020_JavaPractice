package Day48_Abstraction;

interface I1{ // 1 abstract method
    void method1();

}

interface I2 extends I1{ // 2 abstract methods
    void method2();
}

abstract class AC implements I2{ // 3 abstract methods
    abstract void method3();
}


public abstract class extends_implements extends AC { // 3 abstract methods

    @Override
    public void method1() {

    }

    // 2 abstract methods left: method2() & method3()
}


class RunTest extends extends_implements{

    public void method2(){

    }

    public void method3(){

    }
}
