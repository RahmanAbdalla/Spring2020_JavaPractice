package OfficeHours.Practice_05_13_2020;

public class StaticBlock {

    static String str;
    // static Excel excelsheet;
    int a = 100;
    static{
        str = "Cybertek";
        str = "Harvard";
        str = "MIT";

        // a = 300;
    }



    public static void main(String[] args) {
        str = "Cybertek";
        System.out.println(str);

    }

}

class staticBlockTest{

    public static void main(String[] args) {
        System.out.println( StaticBlock.str );

    }

}
