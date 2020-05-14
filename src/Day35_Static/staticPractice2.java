package Day35_Static;

public class staticPractice2 {

    String brand;
    String model;

    static boolean hasWheels = true; // we want this to be used in every case that's why we declare it as static

    public  void printBrand() {

        System.out.println(brand);//null
        System.out.println(hasWheels);//true
    }

    public void printModel (){
        System.out.println(model);//null
    }

    public static void main(String[] args) {

        System.out.println(hasWheels);

     //   System.out.println(brand); WRONG coz it only accepts static variables
     //   System.out.println(model); Same here

        //but we can call instance method through the class name

        staticPractice2 obj = new staticPractice2();
        obj.printBrand();// null, true
        obj.printModel();//null
    }


}
