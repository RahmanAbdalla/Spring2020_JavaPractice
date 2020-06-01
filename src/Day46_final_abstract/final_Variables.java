package Day46_final_abstract;

public class final_Variables {

    final int InstanceVariable = 300; // we can call it in the main method through object bu cannot reassign it
    // final int InstanceVariable2; When instance variables are final, they need to be initialized immediately
    final static int staticVariables = 1000;
    // final static int staticVariables2; When static variables are final, they also need to be initialized immediately

    public static void main(String[] args) {

       final double PI = 3.14;

       // PI=2;

       final String gender = "Male";
       // gender = "Female";

        final int score;
        score = 100;
        // score = 200; we cannot reassign it here
        System.out.println(score);

        final_Variables obj = new  final_Variables();

        // obj.InstanceVariable =//  400; we cannot reassign it coz it's final now, otherwise we could

       // staticVariables = 2000;  We cannot reassign this static variable coz it's final
    }
}
