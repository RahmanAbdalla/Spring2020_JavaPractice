package Day42_Inheritance.Task02;

public class Device {
    /*
    create a class called device:
				attributes: brand, model, price, country
				methods: toString
     */

    String brand; String model;
    double price; String type; int size;
    String country;

    public void setInfo (String brand, String model, double price, String type, int size, String country){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.size=size;
        this.type=type;
        this.country=country;
    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Type: "+type+
                ", Size: "+size+", Price: $"+price+", Made in: "+country;
    }

}

class TV extends Device{
/*
create a class called TV:
				attributes: brand, model, price, country
				methods: watch, toString
 */

    public void watch (String channel){
        System.out.println("Watching \""+channel+"\" channel");
    }
}


class phone extends Device{
    /*
		create ba class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */
    public phone (String brand, String model, double price, int size ){// we use this cons coz we want to set the info
        setInfo(brand,model,price,"Phone",size,"China");   // as soon as we create the obj, unlike the obe for TV
    }

    public void call (long phoneNum){
        System.out.println("Calling ("+phoneNum+") from "+brand+" "+model);
    }
    public void text (long phoneNum){
        System.out.println("Texting ("+phoneNum+") from "+brand+" "+model);
    }

    public void charging(){
        System.out.println("Charging "+brand+" "+model+" ...");
    }
}


class deviceObject{

    public static void main(String[] args) {

        TV tv1 = new TV();

        tv1.setInfo("Samsung", "G20",500,"TV",50,"USA");
        System.out.println(tv1);

        tv1.watch("BBC");

        phone phone1 = new phone("Galaxy", "Note 10 Plus",1000,10);

        System.out.println(phone1);

        phone1.call(540435554);
        phone1.charging();

    }
}




