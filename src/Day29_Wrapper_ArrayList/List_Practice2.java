package Day29_Wrapper_ArrayList;
import Resourses.Library;

import java.util.ArrayList;
import java.util.Scanner;
public class List_Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five numbers");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            list.add(n);
        }

        System.out.println(list);
        // for each loop
        int max = Integer.MIN_VALUE;
        for (int each : list){
      // OR (Integer each : list)
            if (each > max){
                max = each;
            }
        }
        System.out.println(max);

        // Regular For Loop
        Integer max2 = Integer.MIN_VALUE;
        for (int k=0; k< list.size(); k++){
       // OR (Integer k=0; k< list.size(); k++)

            if (list.get(k) > max2){
                max2 = list.get(k);
            }
        }
        System.out.println(max2);


        // Calling custom method


        int max3 = Library.maxArrayList(list);
        System.out.println(max3);
    }
}
