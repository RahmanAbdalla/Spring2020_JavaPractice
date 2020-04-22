package Day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {



      //  int score [] = {70, 75, 85, 90, 95,100}; We can place [] either before or after variable name
        int[] score = {70, 75, 85, 90, 95,100};
                 //    0    1   2   3  4   5
        // retrieve: variableName [index];

        int num1 = score[2];
        int num2 = score[5];
        System.out.println(num1+ " and "+num2);

    }
}
