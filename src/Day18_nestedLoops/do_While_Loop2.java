package Day18_nestedLoops;

public class do_While_Loop2 {
    public static void main(String[] args) {

        int number = 103;// print between 100 - 103

        while (number >= 100){// it's always true so it's infinite time
            System.out.println(number);
            number--; //prints 103,102,101,100
        }
        System.out.println("================");

        int number2= 103;
        do {
            System.out.println(number2);// print between 100 - 103
            number2--;
        }while (number2 >=100);
    }
}
