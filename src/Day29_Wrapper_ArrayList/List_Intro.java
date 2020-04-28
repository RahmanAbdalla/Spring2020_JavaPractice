package Day29_Wrapper_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class List_Intro {
    public static void main(String[] args) {

      //ArrayList <int> scores = new ArrayList<int>(); ERROR coz ArraysList ONLY accepts Non-Primitive (Objects).
        ArrayList <Integer> scores = new ArrayList<Integer>();// OK coz ArraysList accepts Wrapper Class
        // Second DateType, <Integer> on the right is not Mandatory that's why it's in gray color

        //**********  add() Methods => it adds values to the ArrayList   ***************
        scores.add(10); //size== 1.  autoboxing coz unless ArrayList does't accept it, so now 10 is Wrapper class NOT int
        scores.add(20); //size==2.  still autoboxing
        scores.add(30);//size ==3.

        System.out.println(scores); // [10, 20, 30]

        //********  get() Method => used for calling a specific index of the ArrayList  ***********
        Integer a1 = scores.get(2);// NO BOXING  30
        int a2 = scores.get(2); // Unboxing   30
        double a3 = scores.get(2); // Unboxing  30.0
        System.out.println(a1);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five numbers");
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int i=0; i <= 5; i++ ) {
            int n = scan.nextInt();
            list.add(n);
        }
        System.out.println(list);

        int max = Integer.MIN_VALUE;
        for (Integer each : list){
            if (each > max){
                max = each;
            }
        }
        System.out.println(max);
    }
}
