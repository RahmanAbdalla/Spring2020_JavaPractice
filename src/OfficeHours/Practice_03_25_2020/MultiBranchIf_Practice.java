package OfficeHours.Practice_03_25_2020;

public class MultiBranchIf_Practice {
    public static void main(String[] args) {

        int num = -2;

        if (num>0){
            System.out.println(num+" is positive");
        }else if (num<0){
            System.out.println(num+" is negative");
        }else {
            System.out.println(num+" is zero");
        }

        int num1 = 200;
        int num2 = 200;

        if (num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }else if (num2>num1){
            System.out.println(num2+" is greater than "+num1);
        }else {
            System.out.println(num1+" is equal to "+num2);
        }

        System.out.println("======================================");

        String browserName = "Firefox";

        if (browserName=="Firefox"){
            System.out.println("Firefox browser is opening");
        }else if(browserName=="Chrome"){
            System.out.println("Chrome browser is opening");
        }else if (browserName=="internet Explore"){
            System.out.println("Internet Explorer is opening");
        }else if (browserName=="Safari"){
            System.out.println("Safari browser is opening");
        }else if (browserName=="Opera"){
            System.out.println("Opera browser is opening");
        }else if (browserName=="Torch"){
            System.out.println("Torch browser is opening");

        }else {
            System.out.println("Invalid Browser Name");
        }
    }
}
