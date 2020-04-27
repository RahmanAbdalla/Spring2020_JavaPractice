package Day29_Wrapper_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class List_Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five numbers");
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int i=0; i < 5; i++ ) {
            int n = scan.nextInt();
            list.add(n);
        }
        System.out.println(list);
        Integer max = Integer.MIN_VALUE;
        for (int k=0; k<5; k++){
            if (list.get(k)>max){
                max = list.get(k);
            }
        }
        System.out.println(max);
    }
}
