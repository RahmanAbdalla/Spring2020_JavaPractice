package Day15_ForLoop;
public class ForLoop_Practice {
    public static void main(String[] args) {


        String odd = " ";
        for (int number = 1; number <= 100; number +=2) {// to get odd number we have to add 2 each time
 // number MUST be 1 coz 1 is the first even number     //  coz 1+2 ==>3, then 3+2 ==>5 ...

         //   System.out.print(number+" ");
            odd+=number+" ";
        }
        System.out.println(odd);
        String even = " ";
        // even numbers
        for (int number = 2; number <= 100; number +=2){
        // number MUST be 2 coz 2 is the first even number
            even+=number+" ";
        }
        System.out.println(even);


    }
}
