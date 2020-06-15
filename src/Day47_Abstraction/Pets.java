package Day47_Abstraction;

public abstract class Pets {
    /*
    1. creaet an abstract class called Pets
                    attributes: name, age, color, breed, gender
                    methods:
                        abstract methods: sleep, eat, speak
                        instance method: toString
            2. create three sub classes (non-abstract) of pet:
                                    1. Dog
                                    2. Cat
                                    3. Tiger
                    each class MUST have constructors to initialize the attributes

     */
    String name; String color; String breed;
    int age; char gender;

    abstract void sleep();

    abstract void eat();

    abstract void speak();

    public String toString(){
        return "Name: "+name+", Color: "+color+", Breed: "+breed+", Age: "+age+", Gender: "+gender;
    }
}

class Dog extends Pets{

    public Dog(String name, int age, String color, String breed, char gender ){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }

    @Override
    void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    void eat() {
        System.out.println(name+" is eating");
    }

    @Override
    void speak() {
        System.out.println(name+" is NOT speaking");
    }
}


///// Cat class
class Cat extends Pets{

    public Cat(String name, int age, String color, String breed, char gender ){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }

    @Override
    void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    void eat() {
        System.out.println(name+" is eating");
    }

    @Override
    void speak() {
        System.out.println(name+" is NOT speaking");
    }
}


/// Tiger class
class Tiger extends Pets{

    public Tiger(String name, int age, String color, String breed, char gender ){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }

    @Override
    void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    void eat() {
        System.out.println(name+" is eating");
    }

    @Override
    void speak() {
        System.out.println(name+" is NOT speaking");
    }
}

class petsObject{

    public static void main(String[] args) {

        Dog dog1 = new Dog("Buji", 2, "white", "Beagle", 'M');

        dog1.sleep();
        dog1.eat();
        dog1.speak();

        Cat cat1 = new Cat("Tommy", 1,"black","Ragdoll", 'F' );

        cat1.sleep();
        cat1.eat();
        cat1.speak();

        Tiger tiger1 = new Tiger("King",3,"white","Sumatran",'F');

        tiger1.sleep();
        tiger1.eat();
        tiger1.speak();
    }
}
