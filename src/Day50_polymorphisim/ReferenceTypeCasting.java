package Day50_polymorphisim;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        int a = 100;
        double d = a; // implicit casting
      //  double d = (double)a;  We can also do it manually but it's not required

        System.out.println("================= UpCasting ================");

        Dog dog = new Dog("A",2,'M');

        Animal animal1 = dog; // upcasting, done implicitly done
      //  Animal animal1 = (Animal) Dog; We can also do it manually but it's not required

        Cat cat = new Cat("hellu", 3,'F');
       // Dog dog2 = (Dog) cat; ERROR: no isA relation

        Animal animal2 = (Animal) cat; // Upcasting, done implicitly

        System.out.println("================= DownCasting ================");
        double c = 20;
        int g = (int)c; // Explicit casting, done manually

        Animal animal3 = new Dog("Billy", 2,'F');
        Animal animal4 = new Cat("Silly", 1,'M');

        Dog dog2 = (Dog) animal3; // DownCasting, done manually
        Cat cat3 = (Cat) animal4; // DownCasting, done manually


    }
}
