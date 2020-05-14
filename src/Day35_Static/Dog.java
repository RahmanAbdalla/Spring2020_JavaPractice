package Day35_Static;

public class Dog {

    // whenever we want each variable to have its own copy then use instance variables

    String breed;

    static boolean isPet; // this variable will be shared by all the dogs objects

    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.isPet =  true;

        Dog dog2 = new Dog();
        dog2.breed = "Poddle";

        System.out.println(dog1.breed);
        System.out.println(dog2.breed);

        System.out.println(dog1.isPet);
        System.out.println( dog2.isPet);

    }
}
