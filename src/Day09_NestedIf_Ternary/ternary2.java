package Day09_NestedIf_Ternary;

public class ternary2 {
    public static void main(String[] args) {

        String result = "";
        if (9>10){
            result = "9 is greater";

        }else {
            result = "10 is greater";
            System.out.println(result);
        }
        String result2 = (9>10) ? "9 is greater" : "10 is greater";

        System.out.println(result2);

        System.out.println("=====================================");

        int age = 20;
        boolean eligibility;

        if (age>=21){
            eligibility = true;
        }else{
            eligibility=false;
        }
        System.out.println(eligibility);

        boolean eligibilty2= (age >= 21) ? true : false;

        System.out.println(eligibilty2);

        System.out.println("=====================================");

        int ageOfPerson = 20;

        String eligibleToVote= (age>20) ? "You're eligible to vote":"You're not eligible to vote";

        System.out.println(eligibleToVote);



        /* int age = 50;
        int age2=0;

        if (age == 50){
            age2=10;
        }else{
            age2=15;
        }
        System.out.println(age2);


        int age3 = (age == 50) ? 10 : 15;

        System.out.println(age3);

         */
    }
}
