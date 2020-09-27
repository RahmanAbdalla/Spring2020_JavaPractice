package Day47_Abstraction;

abstract class A{

    public abstract void method1();

    public void method2(){
        System.out.println("hi");
    }
}

public class Abstract_VS_NonAbstract2 extends A{//When subclass is NOT abstract as superclass then it's MANDATORY
                                                    // to override methods of the superclass
    // We also have theo methods here
    @Override
    public void method1(){

    }

    @Override
    public void method2(){
    }

}


abstract class B extends A{//When subclass is abstract too as superclass then it's optional to override methods of
                            // the superclass
    // Now in class B we have 2 methods: One abstract and one instance methods
}

class C extends B{

    @Override
    public void method1(){

    }
}
