package Day48_Abstraction;

interface A1{

    void methodA1();

}


interface B1{

    public String methodB1();
}

interface C1 {

    public abstract int methodC1();

}


public class Abstractions2 implements A1, B1, C1 {

    public void methodA1(){

    }

    public String methodB1(){
        return "hi";
    }

    public int methodC1(){
        return 100;
    }
}
