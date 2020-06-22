package JavaInterviewQuestions;

public class primeNumbers {
    public static void main(String[] args) {

        int num=4;

        boolean result = false;

        if(num <= 1) {

            System.out.println(result);

        }

        for(int i = 2; i < num; i++) {

            if(num % i == 0 ) {

                System.out.println(true);

            }

        }
    }
}
