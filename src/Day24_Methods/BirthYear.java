package Day24_Methods;

public class BirthYear {

    public static void age (int birthYear){

        int currentYear = 2020;
        int age = currentYear - birthYear;

        if (birthYear > currentYear) {
            System.out.println("LOL. You are not born yet");

        }else if (birthYear < 1900){
            System.out.println("LOL. You relate to the museum");
        }else {
            System.out.println("Age is: " +age);
        }


    }

    public static void MaxNum (double n1, double n2, double n3){

        if (n1 > n2 && n1 > n3){
            System.out.println("Largest number is: "+n1);
        }
    }

    public static void main(String[] args) {

        int a = 2019;
        age(a);
    }
}
