package Day33_CustomClass;

public class carObject2 {
    public static void main(String[] args) {

        /*car1.brand = "VW";
                car1.model = "Jetta";
                car1.color = "Black";
                car1.year = 2020;
          Instead of doing these steps for every single object (car1,car2,car3 ..) we just call the action custom method
           we created in the Car method.
                 */
        Car car1 = new Car();
        car1.setCarInfo("Jetta","Jetta","Black",2020);

        Car car2 = new Car();
        car2.setCarInfo("Buick","X1","Silver",2020);

        Car car3 = new Car();
        car3.setCarInfo("Lincoln","G6","White",2020);


        // we can put all the three objects (car1, car2, car3,...) into one array. Like this:
        Car carArr [] = {car1,car2,car3};

        for (Car each : carArr){
            each.getCarInfo();
        }
        System.out.println("==================");

        for (int i=0; i < carArr.length; i++){
            carArr[i].getCarInfo();
        }
        System.out.println("=========== Using toString() METHOD ==========");
        //If we haven't created this toString() method earlier then we'll have hashcodes instead of the actual result
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
