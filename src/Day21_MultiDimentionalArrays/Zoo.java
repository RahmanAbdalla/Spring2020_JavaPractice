package Day21_MultiDimentionalArrays;

import java.io.StringReader;

public class Zoo {
    public static void main(String[] args) {

        String [] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Corocodile"};
        String [] birds = {"Eagle", "Duck", "Peacock", "Chicken"};
        //                    0        1        2          3
        String [][] zoo = { wildAnimals, birds };
                          //    0          1
        String kfc = zoo[1][3]; // 1 is zoo index number and 3 is birds index number
        System.out.println(kfc);// returns: Chicken

        String res1 = "";
        for (String allBirds : zoo[1]) {

            if (allBirds.equals("Chicken")) {
                continue;
            }
            res1 += allBirds + ", ";
        }
            System.out.println(res1.substring(0,res1.length()-2));// to get rid of the comma

        System.out.println("====================================");

        for (String allWildAni : zoo[0]){
            if (allWildAni.equals("Turtle")){
                continue;
            }
            System.out.print(allWildAni+" ");
        }
    }
}
