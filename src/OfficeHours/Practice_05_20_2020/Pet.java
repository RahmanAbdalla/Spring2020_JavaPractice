package OfficeHours.Practice_05_20_2020;

public class Pet {

   protected String name; protected String color; protected String size; protected String breed;
   protected int age;
   protected static int  numberOfEyes=2;
   protected static boolean isPet = true;

   public void getInfo (String name, String color, int age, String size, String breed){
       //we can also create this method for each pet(dog,cat,bunny) in case we want to directly set info as soon as
       // we create the object
       this.name=name;
       this.color=color;
       this.age=age;
       this.size=size;
       this.breed=breed;
   }
   public void eat (String food){
       System.out.println(name+" is eating "+food);
   }
   public void sleep(){
       System.out.println(name+" is sleeping");
   }
   public void drink(String drink){
       System.out.println(name+" is drinking "+drink);
   }

   public String toString(){
       return "Name: "+name+", Age: "+age+", Breed: "+breed+
               ", Number of eyes: "+numberOfEyes+", Is a pet: "+isPet;
   }

}

class Dog extends Pet{

    /*
      Dog:
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, bark

     */

    public void bark(){
        System.out.println(name+" is barking");
    }

}

class Cat extends Pet{

    /*
     variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, scratch

     */

    public void scratch(){
        System.out.println(name+" is scratching");
    }

}

class Bunny extends Pet{

    /*
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, Dig
     */

    public void digging(){
        System.out.println(name+" is digging");
    }

}

class PetObjects{

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.getInfo("Boby","black",2,"big","husky");

        System.out.println(dog1);
        dog1.sleep();
        dog1.drink("water");
        dog1.eat("meat");
        dog1.bark();


        Cat cat1 = new Cat();
        cat1.getInfo("Tom","blue",1,"small","unknown");

        System.out.println(cat1);
        cat1.sleep();
        cat1.drink("milk");
        cat1.eat("bread");
        cat1.scratch();


        Bunny bunny1 = new Bunny();
        bunny1.getInfo("Boojy","whitre",1,"medium","wild");

        System.out.println(bunny1);
        bunny1.sleep();
        bunny1.drink("water");
        bunny1.eat("carrot");
        bunny1.digging();
    }
}


