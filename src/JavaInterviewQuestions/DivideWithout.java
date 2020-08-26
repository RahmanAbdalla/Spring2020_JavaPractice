package JavaInterviewQuestions;

public class DivideWithout {
    public static void main(String[] args) {

        int a = 15;
        int b = 40;

        int res = 0;

        if (a > b) {
            for (int i = a; i > 0; i--) {
                res = a - b;
            }
        } else {
            for (int i =b ; i > 0; i--) {
                res = b - a;
            }
        }

        System.out.println(res);
    }
}
