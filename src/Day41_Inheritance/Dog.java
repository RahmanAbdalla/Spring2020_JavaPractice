package Day41_Inheritance;

public class Dog extends Animal {

    public void bark(){
        System.out.println(name+" is barking");
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        System.out.println(dog1.name);

       dog1.move();
       dog1.eat();
       dog1.bark();
     //  dog1.swim(); we cannot call this method coz it only belongs to the fish class
    }

}
