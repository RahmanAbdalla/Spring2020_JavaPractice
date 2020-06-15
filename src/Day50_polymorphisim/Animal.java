package Day50_polymorphisim;

public abstract class Animal {

    public int age; public char gender;


    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public static void staticMethod(){
        System.out.println("Animal");
    }


}//End of Animal class


final class Cat extends Animal {
    public String catName;

    public Cat(String catName, int age, char gender){
        this.catName = catName; this.age=age; this.gender=gender;
    }

    public void scratch(){
        System.out.println(catName+" is scratching");
    }

    @Override
    public void eat(){
        System.out.println("Cat "+catName+" is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat "+catName+" is sleeping");
    }

}// End of Cat class


final class Dog extends Animal{
    public String dogName;

    public Dog(String dogName, int age, char gender){
        this.dogName=dogName; this.age=age; this.gender=gender;
    }

    @Override
    public void eat(){
        System.out.println("Dog "+dogName+" is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Dog "+dogName+" is sleeping");
    }

    public void bark(){
        System.out.println("Dog "+dogName+" is barking");
    }

    public static void staticMethod(){ //this still won't be printed in the main coz it's overloaded not overridden
        System.out.println("Overloaded method");
    }
}


class AnimalObjects{

    public static void main(String[] args) {

        Dog dog1 = new Dog("Melly",2,'F');
        System.out.println(dog1.dogName);
        dog1.bark();

        Animal dog2  = new Dog("Melly",2,'F');
        //System.out.println(dog1.dogName); coz we don't have this method in Animal class
       // dog2.bark(); coz we don't have this method in Animal class

        dog2.eat();// if we have a method in both Parent class and child class then when we call it the overridden
                    // one (child's method) gets executed NOT the parent's one
        dog2.sleep();

        dog2.staticMethod(); // this prints Parent class one though we call it from dog obj, or Animal class coz it's not overriddenAn
        Animal.staticMethod();

        System.out.println("================= CAT ==================");

        Animal animal1 = new Cat("Lucy", 1,'M');

        boolean isDog = animal1 instanceof Dog; // False

        System.out.println(isDog); // False

        Dog d1 = new Dog("A",4,'F');

       // boolean isCat = d1 instanceof Cat; Coz there's not isA relation bet Dog and Cat

        boolean isCat = d1 instanceof Dog;// coz Dog is Dog (isA relation)
        boolean isAnimal = animal1 instanceof Animal; // Coz animal is animal (isA relation)

        System.out.println("============= casting ===============");

        Animal animal5 = new Dog("bull", 3,'F');

        // animal5.bark();

        //but we can call bark() action by Casting
        Dog dog3 = (Dog) animal5;

        //One way
        dog3.bark(); //Dog bull is barking


        //Second way
        ( (Dog)animal5 ).bark(); //Dog bull is barking

    }
}