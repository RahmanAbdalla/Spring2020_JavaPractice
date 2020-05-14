package Day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Tester;

public class StaticBlock4 {

    static String name;
    static Tester tester3 = new Tester();

    int insVariable;


    static {

        //gets executed as soon as the class is loaded
        // designed to initialize static variables
        name = "Cybertek";

        tester3.setInfo("Adil","SDET",110000,123);

        StaticBlock4 obj1 = new StaticBlock4();
        obj1.insVariable = 300;
    }

    public static void main(String[] args) {

        System.out.println(StaticBlock4.name);// Cybertek. Coz we initialized (name) within the Static Block
        System.out.println(tester3);
   //OR System.out.println(StaticBlock4.tester3);

        tester3.setInfo("Adil","SDET",110000,123);// we can also setInfo here, but we CANNOT
                                            // call it through the Static class later on.

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println(obj2.insVariable);//0. Coz we haven't initialize it, but still we can call it


    }
}
