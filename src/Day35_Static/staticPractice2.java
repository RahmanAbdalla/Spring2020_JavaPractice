package Day35_Static;

public class staticPractice2 {

    String brand;
    String model;

    static boolean hasWheels = true; // we want this to be used in every case that's why we declare it as static

    public  void printBrand() {

        System.out.println(brand);
        System.out.println(hasWheels);
    }

    public void printModel (){
        System.out.println(model);
    }

    public static void main(String[] args) {

        System.out.println(hasWheels);

     //   System.out.println(brand); WRONG coz it only accepts static variables
     //   System.out.println(model); Same here
    }


}
