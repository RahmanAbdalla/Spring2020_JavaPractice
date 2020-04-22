package Day09_NestedIf_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {

        double salary = 120000;
        byte workHistory = 2;
        String qualified = "";

        if (salary >= 30000){
            qualified = "Might be qualified";
            if (workHistory >= 2){
                qualified= "You are qualified";

            }else {
               qualified= "You must have been on a job at least 2 years";
            }

        }else {
            qualified= "You must earn at least $30000";
        }
        System.out.println(qualified);

    }
}
