package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();
                shoppingList.add("Milk"); // size: 1
                shoppingList.add("Watermelon"); // size: 2
                shoppingList.add("Bread"); // size: 3
                shoppingList.add("flour");// size: 4
                shoppingList.add("eggs"); //size: 5

        System.out.println(shoppingList);
        for (int i=0; i <shoppingList.size(); i++){
            System.out.print(shoppingList.get(i)+" ");
        }
        System.out.println();
        System.out.println("========================");
        // for each loop
        for (String each : shoppingList){
            System.out.println(each);
        }

        // size():
        int size = shoppingList.size();
        System.out.println(size); // size: 5

        int lastIndex = shoppingList.size() -1;
        System.out.println(lastIndex);// last indext: 4

    }
}
