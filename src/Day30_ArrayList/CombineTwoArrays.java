package Day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrays {
    public static void main(String[] args) {

        /*  5. write a program that can combine two String arrays into one arrayList
                    ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */
            String arr1[] = {"A", "B", "C"};
            String arr2[] = {"D", "E", "F", "G"};
            ArrayList<String> list = new ArrayList<>();

            for (int i=0; i < arr1.length; i ++){
                list.add(arr1[i]);
            }
            for (int k=0; k < arr2.length; k++){
                list.add(arr2[k]);
            }
            System.out.println(list);
    }
}

