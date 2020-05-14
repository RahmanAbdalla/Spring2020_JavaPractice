package Day33_CustomClass;

public class carObject {
    public static void main(String[] args) {

       Car car1 = new Car(); // this is the object name
        car1.brand = "BMW";
        car1.model = "X5";
        car1.color = "Black";
        car1.year = 2020;
        System.out.println(car1.brand);// instance variables are object variables, we can call them through the object name
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);

        car1.start();
        car1.drive();
        car1.getCarInfo();

        /* we can create more than one object from the same custom class (Car). Like this: But if we don't give values to
         to the object variables again then their values will be (null) for this object (car2)*/
        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Corola";
        car2.color = "White";
        car2.year = 2019;
        System.out.println(car2.brand);// instance variables are object variables, we can call them through the object name
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.year);

        car2.start();
        car2.drive();
        car2.getCarInfo();


        Car car3 = new Car();
        car3.brand = "Nissan";
        car3.model = "Maxima";
        car3.color = "Blue";
        car3.year = 2020;

        car3.start();
        car3.drive();
        car3.getCarInfo();

        // we can put all the three objects (car1, car2, car3) into one array. Like this:

     Car [] cars = {car1,car2,car3};
     cars[0].getCarInfo();
     cars[1].getCarInfo();
     cars[2].getCarInfo();

    }

}
