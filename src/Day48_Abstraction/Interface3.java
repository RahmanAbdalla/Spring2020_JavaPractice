package Day48_Abstraction;

public interface Interface3 {

    public void method1();

    public abstract void method2();

    static final int num = 100; //  by default public
    int num2 = 200; // by default: public static final

    public static void main(String[] args) {

        Interface3.method3();
        System.out.println(num);
        System.out.println(num2);

    }


    static void method3() { //public

    }
}
