package OfficeHours.Practice_05_13_2020;

public class Instances {

    String name;

    //instance block
    {
        name = "Hardi"; // if we don't initialized in this block then we CANNOT use it in another class, but only this one
    }

    public void printName(){
        System.out.println("Name is: "+this.name);
    }

}
