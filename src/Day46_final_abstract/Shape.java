package Day46_final_abstract;

import java.text.DecimalFormat;

public abstract class Shape {

    abstract void Area();


}

final class Circle extends Shape {// we can make it final too, it's OK

    public double radius;
    public final static double PI = 3.14;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    void Area(){
        double area = radius * radius * PI;
        System.out.println("Area of the circle is: "+area);
    }
}


 class Square extends Shape{
    public double side;

    public Square(int side){
        this.side = side;
    }

    @Override
    void Area(){
        double area =  side * side;
        System.out.println("Area of the square is: "+area);
    }
}


class Rectangle extends Shape {

    public double width;
    public double length;

    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    void Area(){
        double area =  width * length;
        System.out.println("Area of the rectangle is: "+area);
    }

}


class triangle extends Shape {
   public double base;
   public double height;

   public triangle (double base, double height){
       this.base=base;
       this.height=height;
   }

    @Override
    void Area(){
        double area =  base * height * 1/2;
        System.out.println("Area of the triangle is: "+area);
    }
}



class ShapeObjects{

    public static void main(String[] args) {

        Circle obj = new Circle(3.5);
        obj.Area();

        Square obj2 = new Square(4);
        obj2.Area();

        Rectangle obj3 = new Rectangle(3,4);
        obj3.Area();

        triangle obj4 = new triangle(4,2);
        obj4.Area();
    }
}