package Day48_Abstraction;

public interface Interface_Intro {

    //1- we can write or don't write (abstract) keyword to create abstract method in interface
    //2- access modifier MUST be 'public', if we even don't give public modifier then it becomes public by default
    //3- We can NOT have constructor in interface
    //4- We cannot have instance method in interface.
    //5- We cannot have instance block or instance variables in interface
    //6- We cannot have static block in interface.


    public abstract void method1();
    public void method2(); // abstract by default

    void method3(); // public by default
}
