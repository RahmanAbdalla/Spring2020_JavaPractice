package Day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Tester;

public class StaticBlock2 {

    // Through static block we can give values to static variables. Like This

    static int a;
    static int b;
    int c; // this is instance variable so we CANNOT initialize it within the Static Block


    static Tester tester1 = new Tester();// if we don't initialize this inside the Static Block, but inside the
    //Main Method then later when we call it though the Static class the values will be (null) and (zero)s.x

    public static void main(String[] args) {
        tester1.setInfo("Rahman","SDET",120000,88443);
        System.out.println(tester1);
    }


    static {
        a = 100;
        b = 200;
        //  c = 300; Static only accepts static variables

        // we can also create, for EX: if condition within the Static Method


        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        tester1.setInfo("Rahman", "SDET", 120000, 88443);

    }
    }
