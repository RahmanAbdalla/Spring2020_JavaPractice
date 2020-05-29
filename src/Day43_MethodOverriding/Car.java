package Day43_MethodOverriding;

public class Car {

    void start (){
        System.out.println("Insert the key");
        System.out.println("Twist ignition key to start");
    }
}


class Tesla extends Car{

 // protected
    public void start(){
        System.out.println("Push button to start");
    }

}

class Honda extends Car{

}

class Jeep extends Car {

    void start (){
        System.out.println("Call some friends\nTell them to push\nRemove clutch peddle suddenly");
    }
}


class CarObjects{

    public static void main(String[] args) {

        Tesla car1 = new Tesla();
        car1.start();

        System.out.println("================== HONDA ==================");
        Honda car2 = new Honda();
        car2.start();

        System.out.println("================== JEEP ==================");
        Jeep car3 = new Jeep();
        car3.start();


    }
}