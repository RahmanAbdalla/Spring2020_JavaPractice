package Day38_Constructors;

public class Dog {

    // we can also overload constructors as we did for regular methods.
    String name;
    String breed;
    int age;

    public Dog (){// set the default value for all instances
        name = "Unknown";
        breed = "Unknown";
        age = 0;
    }

    public Dog (String breed){ // we just want to print the breed of the dog
        name = "Unknown";
        this.breed = breed;
        age = 0;
    }

    public Dog (String name, int age){
        this.name = name;
        breed = "Unknown";
        this.age = age;
    }

    public String toString(){
        return "Dog Name: "+name+", Breed: "+breed+", Age: "+age;
    }
}


class dogsObject{

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);

        System.out.println("=================");

        Dog dog2 = new Dog("Husky");
        System.out.println(dog2);


        Dog dog3 = new Dog("Bora",4);
        System.out.println(dog3);
    }
}
