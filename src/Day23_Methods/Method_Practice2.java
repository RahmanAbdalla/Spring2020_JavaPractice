package Day23_Methods;

public class Method_Practice2 {
    public static void main(String[] args) {

        printOddandnums();
        printEvenNums();


    }

    public static void printOddandnums () {

        for (int i=1; i <=100; i++){
            if (i % 2 !=0){
                System.out.print(i+" ");
            }
        }
    }
    public static void printEvenNums (){
        System.out.println();
        for (int i=1; i <=100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
