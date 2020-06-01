package Day46_final_abstract;

public class final_Practice {

    final int a = 10;
    final static int b =20;

    {
        System.out.println(a);
       // a = 30; coz it's final, so we cannot reinitialize it
    }

    static {

        System.out.println(b);
       // b = 30; coz it's final, so we cannot reinitialize it
    }

    public final_Practice (){ // we cannot give final keyword here coz it's constructor

    }

    final void method1(){ // we can give final keyword here coz it's instance method

    }
    // we can overload instance method1() here though it's final
    public int method1(int a){
         return a;
    }

    public final static void method2(){  // we can give final keyword here coz it's static method

    }

    // we overload static method2() here though it's final
    public final static void method2(int a){

    }

}

class test extends final_Practice {

   /*
    @Override
    public void method1(){

    } */


}
