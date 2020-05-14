package OfficeHours.Practice_05_13_2020;

public class InstanceTask {

    public static void main(String[] args) {

        Instances obj1 = new Instances();
        obj1.name = "Rahman";

        Instances obj2 = new Instances();
        obj2.name = "Adil";

        System.out.println(obj1.name); // Rahman
        System.out.println(obj2.name); // Adil

        obj1.printName();//Rahman
        obj2.printName();// Adil

    }

}



 class InstanceBlock{

        public static void main(String[] args) {

            Instances obj3 = new Instances();
            System.out.println(obj3.name);

        }
}
