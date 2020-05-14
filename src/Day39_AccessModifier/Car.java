package Day39_AccessModifier;

public class Car {

    String brand;
    String model;
    int year;
    double price;


    public Car (String brand){
        this.brand = brand;
    }

    public Car (String brand, String model){
       this(brand);
       this.model = model;
    }

    public Car (String brand, String model, int year){
       this(brand,model);
         this.year = year;
    }

    public Car (String brand, String model, int year, double price){
        this(brand,model,year);
        this.price =price;
    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Year: "+year+", Price: "+price;
    }

    }

    class CarObject{
        public static void main(String[] args) {

            Car obj1 = new Car("BMW");
            Car obj2 = new Car("BMW","G6");
            Car obj3 = new Car("BMW","G6",2020);
            Car obj4 = new Car("BMW","G6",2020,200500);

            System.out.println(obj1);
            System.out.println(obj2);
            System.out.println(obj3);
            System.out.println(obj4);

        }
    }
