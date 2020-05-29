package Day43_MethodOverriding;

class Test {

    protected void method(){ //access modifier MUST be same or more visible when overriding it in the subclass
                            // EX: here it's (protected), and in the subclass it's (public). But if we change it
                            // to default or private then it gives ERROR
        System.out.println("Hello");
    }
}


public class MethodOverriding extends Test {

    @Override // this shows if you overrode the method correctly or No.
    public void method(){
        System.out.println("Hi");
    }
   // void method(){ ERROR coz access modifier is less visible than the one in superclass
   // }

    public static void main(String[] args) {

        Test obj = new Test();
        obj.method(); // Hello

        MethodOverriding obj1 = new MethodOverriding();
        obj1.method(); // Hi, BUT we want to print something else, this can be done by using method overriding
    }

}


