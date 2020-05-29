package Day42_Inheritance;

class superclass{

    int a =100;

    public superclass(double b){
        System.out.println(this.a);
    }

}

public class SuperKeyword extends superclass {

    int a =200;

    public SuperKeyword (){
        super(10.5); //100
        System.out.println(super.a); //100
        System.out.println(this.a);//200
    }

    public static void main(String[] args) {

        SuperKeyword obj = new SuperKeyword(); //100, 100, 200

        superclass obj2 = new superclass(2.4); //100

        System.out.println(obj.a);//200

    }


}
