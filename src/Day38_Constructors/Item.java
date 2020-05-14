package Day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {

  /*
 create a class called Item
                instance variables:
                    name, unitPrice, quantity
                add a constructor that can initialize the fields
                instance methods:
                    calcCost(): returns the total cost as double
                                hint: quantity * unitPrice
                    toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */

        String name;
        double unitPrice;
        int quantity;

        public Item(String name, double unitPrice, int quantity){
            this.name = name;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }


        public double calcCost(){
            return quantity * unitPrice;
        }

        public String toString(){
            return "Item: "+name+", Unit price: $"+unitPrice+", Quantity: "+quantity+
                    "\nTotal Cost of Item: $"+calcCost();
        }



    }

class ShoppingList{

    public static void main(String[] args) {

    /*
    create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list
     */


                //  Item item1 = new Item();
                //   Item item1 = new Item(2.5);

                Item item1 = new Item("Toilet Paper", 25, 100);
                Item item2 = new Item("Paint Brush", 3, 5);
                Item item3 = new Item("Canvas", 4, 6);
                Item item4 = new Item("Apron", 5, 1);
                Item item5 = new Item("Isle", 10, 1);


                ArrayList<Item> shoppingList = new ArrayList<>();
                shoppingList.addAll( Arrays.asList(item1, item2, item3, item4, item5)    );

                double totalCost = 0;

        /*
         solution 1
        for(Item each  : shoppingList ){// each: item1, item2, item3, item4, item5
            totalCost += each.calcCost();
        }
         */

                for(int i = 0; i <  shoppingList.size(); i++){
                    totalCost  += shoppingList.get(i).calcCost();
                }

                System.out.println("Total: "+totalCost);
    }

 }
