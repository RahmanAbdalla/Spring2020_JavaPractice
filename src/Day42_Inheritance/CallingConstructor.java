package Day42_Inheritance;

class test {

    public test(){
        System.out.println("A");
    }


}


public class CallingConstructor extends test {

    public CallingConstructor() {
        super();
        System.out.println("B");

    }

    public static void main(String[] args) {

        // test obj = new test();  // A
        CallingConstructor obj2 = new CallingConstructor(); // AB

    }

}