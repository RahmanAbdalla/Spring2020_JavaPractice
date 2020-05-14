package Day37_Constructors;

public class car {
    String brand;
    String model;
    int year;
    double price;


    public car (String brand, String model, int year, double price){
        this.brand = brand;
        this.model =model;
        this.year = year;
        this.price = price;
    }


    public String toString(){
        return "Year: "+year+", Brand: "+brand+", Model: "+model+", Price: &"+price;
    }
}
