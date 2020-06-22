package Day51_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class shapeObjects {

    public static void main(String[] args) {
/*
    5.
    6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
 */
        circle circle1 = new circle(3);
        circle circle2 = new circle(5);

        cylinder cylinder1 = new cylinder(4,5);
        cylinder cylinder2 = new cylinder(3,4);


        // Polymorphisim
        ArrayList<Shape> list = new ArrayList<>(Arrays.asList(circle1,circle2,cylinder1,cylinder2));

        for (Shape each: list){
            System.out.println(each.name+": "+ each.calculateArea());
        }

        System.out.println("=============== casting ==============");
        System.out.println("Down casting volume of cylinder: "+ ( (cylinder)list.get(2) ).calculateVolume() );

        System.out.println();

       // ( (cylinder)list.get(1) ).calculateVolume; NO isA relation

        Shape shape1 = new circle(5);
        // System.out.println(shape1.radius); We need to down cast it. LIKE BELOW
        System.out.println("Down casting radius: "+ ( (circle)shape1 ).radius );
        System.out.println("Down casting test for circle: "+ ((circle)shape1).calculateArea() );

        Shape shape2 = new cylinder(3,6);
       // shape2.calculateVolume(); We need to down cast it
        System.out.println("Down casting test for cylinder: "+ (  (cylinder)shape2 ).calculateVolume() );  // down casting



    }
}
