package Day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class dogObjects {
    public static void main(String[] args) {

        // we store multiple dog objects in an Array. Instead of making each single dog object one by one
        Dog [] dogs = {new Dog(), new Dog(),new Dog(), new Dog()};

        dogs[0].dogInfo("Husky","Big",2,"Black","Tommy");
        System.out.println(dogs[0]);

        dogs[1].dogInfo("Hawshar","XL",5,"White","Bora");
        System.out.println(dogs[1]);

        dogs[2].dogInfo("Poodle","Small",1,"Grey","Lucy");
        System.out.println(dogs[2]);

        dogs[3].dogInfo("Bull","Medium",3,"Brown","Jerry");

        System.out.println("=========== Applying the action method =============");
        String food = "chickens";
        String drink = "milk";
        dogs[0].eating(food);
        dogs[3].drinking(drink);


        System.out.println("========================");
        // WE can create an ArrayList to store all the dog objects
        ArrayList<Dog> youngDogs = new ArrayList<>();

        for (Dog each : dogs){
            if (each.age <= 2){
                youngDogs.add(each);
            }
        }
        System.out.println(youngDogs);

        // we CAN print out the names of the young dogs and their ages
        for (Dog each : youngDogs){
            System.out.println(each.name+", "+each.age);
        }

        ArrayList<Dog> allDogs = new ArrayList<>(Arrays.asList(dogs));
        // remove all the dogs aged 2 or less
        allDogs.removeIf(p -> p.age <=2);
        System.out.println(allDogs);


        System.out.println("=======================");

        for (int i=0; i < dogs.length; i++){
            dogs[i].drinking(drink);
        }
        for (int i=0; i < dogs.length; i++){
            dogs[i].eating(food);
        }





    }
}
