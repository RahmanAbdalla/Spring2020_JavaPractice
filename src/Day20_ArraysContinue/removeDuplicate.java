package Day20_ArraysContinue;

import java.util.ArrayList;

public class removeDuplicate {
    public static void main(String[] args) {

        Integer [] arr1 = {1,2,3,2,3,4,5,5};
        ArrayList<Integer> nonDup = new ArrayList<>();

        for (int i=0; i < arr1.length; i++){
            if (! nonDup.contains(arr1[i])){
                nonDup.add(arr1[i]);
            }
        }
        System.out.println(nonDup);
    }
}
