package Day30_ArrayList;

import java.util.ArrayList;

public class Reverse_ArrayList {
    public static void main(String[] args) {

              /*
          2. write a program that can print the list of integers in reversed order
            ex:
               list=> {1,2,3,4,5}
               output: 5 4 3 2 1
               */
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1); list.add(2); list.add(3); list.add(4);list.add(5);
            System.out.println(list);
            System.out.print("Reversed list: ");
            for (int k = list.size()-1; k >=0; k--) {
                System.out.print(list.get(k)+" ");
            }
    }
}
