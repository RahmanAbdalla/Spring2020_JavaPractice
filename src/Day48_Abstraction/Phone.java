package Day48_Abstraction;

public abstract class Phone {

    public static String brand; // we can make it static coz we have one copy each time, and we use static block to
                                            // initialize it in the subclass
    public String model; public double price; public String size;

    public abstract void calling(long number);
    public abstract void texting(long number);

    public  String toString(){
        return "Brand: "+brand+", Model: "+model+", Price: $"+price+", Size: "+size;
    }
}

class iPhone extends Phone{

    static {
        brand = "iPhone";
    }

    public iPhone (String model, double price, String size){
       this.model = model; this.price =price; this.size=size;
    }
    public void calling(long number){
        System.out.println("Calling "+number);
    }

    public void texting(long number){
        System.out.println("Texting from "+number);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is faceTiming with "+phoneNumber);
    }

}

class Samsung extends Phone{


    static {
        brand = "Samsung";
    }

    public Samsung(String model, double price, String size){
       this.model= model; this.price=price; this.size = size;
    }

    @Override
    public void calling(long number){
        System.out.println("Calling "+number+" ...");
    }

    @Override
    public void texting(long number){
        System.out.println("Texting "+number+" ...");
    }

    public void wirelessPowerSharing(String name){
        System.out.println("Samsung is power sharing with "+name);
    }

}


class phoneObjects{

    public static void main(String[] args) {

        iPhone iphone = new iPhone("11 Pro", 1000,"10 inches");
        System.out.println(iphone);
        iphone.calling(911);
        iphone.texting(93849399);
        iphone.faceTiming(703545469);


        Samsung samsung = new Samsung("Note 10",900,"11 inches");
        System.out.println(samsung);
        samsung.calling(911);
        samsung.calling(3523341);
        samsung.wirelessPowerSharing("iPhone 11");
    }
}