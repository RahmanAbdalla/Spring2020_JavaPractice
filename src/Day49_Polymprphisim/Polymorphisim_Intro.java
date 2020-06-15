package Day49_Polymprphisim;


// it's OK for superclass to be abstract or interface in case of polymorphisim
// it's NOT OK for subclass to be abstract in case of polymorphisim
class Animal extends Robot{

}

class Dog extends Animal{

}

class Cat extends Animal{

}

class Robot{

}

class Polymorphism_Intro {

    public static void main(String[] args) {

        // Animal obj = new Animal();
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();

        // Dog obj4 = new Cat();
        Dog obj5 = new Dog();
        Cat obj6 = new Cat();

        Robot obj7 = new Robot();

        Animal[] animalShow ={ obj5, obj6};


        Robot obj8 = new Animal();
        Robot obj9 = new Dog();
        Robot obj10 = new Cat();

    }
}
