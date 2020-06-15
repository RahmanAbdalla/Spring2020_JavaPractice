package Day49_Polymprphisim;

public interface Edible {

    void eat();

}

interface Drinkable extends Edible{

    void drink();

}

class Burger implements Edible{

    String name; String size;

    public Burger(String name, String size){
        this.name=name; this.size=size;
    }

    //Must implement this from Edible
    @Override
    public void eat(){
        System.out.println("I'd like to have a "+size+" size "+name+".");
    }

    public String toString(){

        return "Name: "+name+", Size: "+size;
    }
}

class IceCoffee implements Drinkable{

    String size;

    public IceCoffee(String size){
        this.size=size;
    }

    //Must implement this form drinkable
    @Override
    public void drink(){
        System.out.println("Can I have a "+size+" size ice coffee, please?");
    }

    //Must implement this form Edible, coz drinkable extends edible
    @Override
    public void eat(){
        System.out.println("Ice coffee can be drunk and not eaten.");
    }

    public String toString(){
        return "Size: "+size;
    }
}


class foodObjects{

    public static void main(String[] args) {

        Burger burger = new Burger("Meat Burger","medium");
        System.out.println(burger);
        burger.eat();

        IceCoffee iceCoffee = new IceCoffee("Big");
        iceCoffee.drink();
        iceCoffee.eat();
    }
}
