package Day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {

           /*  3. write a program that can print out the unique elements from an int array
              HINT: store all the unqie elemenbts of array into a list of integers
              Ex: array==> {1,1,2,3,3,4,5}
              output: {2,4,5}

            */

            int arr [] ={1,1,2,3,3,4,5,7};
            ArrayList<Integer> list = new ArrayList<>();
            int count;
            for (int each : arr){
                count=0;
                for (int each2 : arr){
                    if (each == each2){
                        count++;
                    }
                }
                if (count ==1){
                    list.add(each);
                }
            }
            System.out.println(list);
        System.out.println("=================================");
              /* 4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
            uniques ==> {2,4,5}
            */

            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);  list1.add(1); list1.add(2); list1.add(3); list1.add(3); list1.add(4); list1.add(5);
            ArrayList<Integer> list2 = new ArrayList<>();

            int count3;
            for (Integer each : list1){
                count3=0;
                for (Integer each2 : list1){
                    if (each == each2){
                        count3++; }
                }
                if (count3 ==1){
                    list2.add(each); }
            }
            System.out.println(list2);
    }
}
