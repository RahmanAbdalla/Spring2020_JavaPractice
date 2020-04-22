package Day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {

        boolean USCitizen = true;
        int age = 18;

        if(USCitizen){

            if (age > 17){
                System.out.println("You are eligible to vote");
            }else {
                System.out.println("You must be 18 or older to be able to vote");
            }
        }else {

            System.out.println("Only the US citizens are eligible to vote for Donald Trump");
        }
            System.out.println("==========================================");

            int score = 89;
            String grade = "";

            if (score >= 0 && score <= 100){
                if (score >= 90 )
                    grade = "Excellent";
                else if (score >= 80 )
                    grade = "Very good";
                else if (score >=70)
                    grade = "Good";
                else if (score >= 60)
                    grade = "Passed";
                else
                    System.out.println("Failed");

            }

            else {
                System.out.println("Invalid grade");
            }

                 System.out.println(grade);

            // Applying TERNARY to a similar example

            int score2 = 45;

            String grade2 = (score2 >= 90)? "Excellent":(score2 >= 80 )?"Very good":(score2 >=70)?"Good"
                            :(score2 >= 60)?"Passed":"Failed";
        System.out.println(grade2);
    }
}
