package Day38_Constructors;

public class ConstructorPractice {

    public ConstructorPractice() {
        this(2.1);
        System.out.println("A");

    }

    public ConstructorPractice(int a) {
        this();
        System.out.println("B");

    }

    public ConstructorPractice(double a) {
        System.out.println("C");
    }

    public static void main(String[] args) {

        new ConstructorPractice(); // C, A

        System.out.println("================");

        new ConstructorPractice(4); // C, A, B

        System.out.println("==================");


    }
}