package Day18_nestedLoops;

public class NestedLoop {
    public static void main(String[] args) {


        for (int j=1; j<=5; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i);
            }
            System.out.println();// we have to break the line otherwise they all print in one line
        }

        System.out.println("==============================");

        int a = 1;
        int a1 =1;
        for (int i=1; i<=7; i++){
            while (a <= 7) {
                System.out.println("******");/* if we want to change the num of asteraks then
                                        we need to change it within the inner loop */
                a++;
            }
        }
    }
}
