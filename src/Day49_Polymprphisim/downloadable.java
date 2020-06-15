package Day49_Polymprphisim;

public interface downloadable {
    boolean downloadable=true;
    void download();

}

interface AndroidApps extends downloadable{
    String appStoreName = "PlayStore";

}

interface AppleApps extends downloadable{
    String appStoreName = "AppStore";

}

abstract class Phone{

    public static String brand; public String model; public String size;
    public double price;

    abstract void texting(long phoneNumber);

    abstract void calling(long phoneNumber);

    abstract void selfie();

}

class iPhone extends Phone implements AppleApps {

    public iPhone(String model, String size, double price){
        brand = "iPhone"; this.model=model; this.size=size; this.price=price;
    }

    @Override
    public void download(){
        System.out.println(brand+model+" is downloading from "+appStoreName);
    }

    @Override
    public void texting(long phoneNumber){
        System.out.println("Texting ("+phoneNumber+") from "+brand+model+"...");
    }

    @Override
    public void calling(long phoneNumber){
        System.out.println("Calling ("+phoneNumber+") from "+brand+model+"...");
    }

    @Override
    public void selfie(){
        System.out.println("Taking selfie from "+brand+model+".");
    }

    //Specific action to iPhone
    public void faceTiming(long phoneNumber){
        System.out.println("Facetiming ("+phoneNumber+") from "+brand+model+"...");
    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Size: "+size+", Price: $"+price;
    }

}

class Nokia extends Phone implements AndroidApps{

    public Nokia(String model, String size, double price){
       brand="Nokia"; this.model=model; this.size=size; this.price=price;
    }

    public void download(){
        System.out.println("jar files can be downloaded from "+brand+model);
    }

    public void texting(long phoneNumber){
        System.out.println("Texting ("+phoneNumber+") from "+brand+model+"...");
    }

    public void calling(long phoneNumber){
        System.out.println("Calling ("+phoneNumber+") from "+brand+model+"...");
    }

    public void selfie(){
        System.out.println("Taking selfie from "+brand+model+".");
    }

    //Specific action to Nokia
    public void freezing(){
        System.out.println(brand+model+" is freezing.");
    }

    public void breakingFlood(){
        System.out.println(brand+model+" known as floor breaker.");
    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Size: "+size+", Price: $"+price;
    }
}



class phoneObjects{

    public static void main(String[] args) {

        iPhone iPhone = new iPhone("11Pro","11 inches",1000);

        System.out.println(iPhone);
        iPhone.calling(422942398);
        iPhone.faceTiming(75674433);
        iPhone.selfie();
        iPhone.texting(645398790);
        iPhone.download();

        System.out.println("=====================");

        Nokia nokia = new Nokia("3310","5 inches",50);
        System.out.println(nokia);
        nokia.breakingFlood();
        nokia.calling(793534422);
        nokia.freezing();
        nokia.selfie();
        nokia.texting(429235844);
        nokia.download();

    }
}
