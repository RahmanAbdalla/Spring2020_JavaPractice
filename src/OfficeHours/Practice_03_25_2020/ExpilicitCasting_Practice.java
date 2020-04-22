package OfficeHours.Practice_03_25_2020;

public class ExpilicitCasting_Practice {
    public static void main(String[] args) {

        byte bnum = 100;

        short snum = bnum; // implicit casting

        int iNum = 200;
      //  short sNum = iNum; Wrong coz int is larger. This is how we do it
        short sNum = (short)iNum; // Explicit casting

        float fNum = (float)0.5;
        System.out.println(fNum); // 0.5

        float fNum2 = (long)0.5;
        System.out.println(fNum2);

        long lNum1 = (long) 4.5;
        System.out.println(lNum1); // result: 4 coz whole num

        System.out.println(9 / (float)2);// to get a decimal result you have to change one to double or float

        System.out.println(10.0 / 3);// or like this
    }
}
