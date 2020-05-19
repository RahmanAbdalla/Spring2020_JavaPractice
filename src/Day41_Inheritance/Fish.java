package Day41_Inheritance;

public class Fish extends Animal {

    public void swim (){// this action is unique to fish
        System.out.println(name+" is swimming");
    }

    public static void main(String[] args) {

        Fish fish1 = new Fish();

        fish1.name = "Dowry";
        System.out.println(fish1.name);
        fish1.eat();
        fish1.move();
        fish1.swim();
       // fish1.bark(); we cannot call this method coz it ONLY belongs to the dog class.
    }
}
