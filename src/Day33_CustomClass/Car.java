package Day33_CustomClass;

public class Car {  // this is our Custom Class

    // instance variable are declared outside the main method
    String brand;
    String model;    //   ==> these are called object variable. And they can be assigned to more than one object but
    String color;          // their values will be printed in the object in which the obj variable are given values
    int year;

    public void start (){  // we can call this method from the object we created in the other class.
        System.out.println(brand+" is started");

    }

    public void drive (){
        System.out.println("Driving "+brand+", "+model);
    }
    public void getCarInfo (){
        System.out.println(year+" "+brand+" "+model+" "+color);
    }

    // we want to create another action method so it gets all the object variable all at the same time

    public void setCarInfo (String carbran, String carModel, String carColor, int carYear ){
        brand = carbran;
        model = carModel;
        color = carColor;
        year = carYear;
    }

    //inorder to print the car object directly as string NOT hashcodes, so we need to create a toString() method
    public String toString (){
        String result = year+" "+brand+" "+model+" "+color;
        return result;
    }




    // End of Custom Class


    public static void main(String[] args) {

        int a = 100;

    }
}
