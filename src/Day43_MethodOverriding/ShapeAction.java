package Day43_MethodOverriding;

public class ShapeAction {

    public static double pi=3.14;
    public String name;
    public double area; public double perimeter;

    public void calculateArea(){
        area=0;
        System.out.println("Area of the shape is :"+area);

    }

    public void calculatePerimeter(){
        perimeter=0;
        System.out.println("Perimeter of the shape is: "+perimeter);
    }

}

class Circle extends ShapeAction{
    public double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void calculateArea(){
        area = radius * radius * pi;
        System.out.println("Area of the circle is: "+area);
    }

    public void calculatePerimeter(){
        perimeter=3.14 * 2 * radius;
        System.out.println("Perimeter of the circle is: "+perimeter);
    }

}

class Rectangle extends ShapeAction {

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        area = length * width;
        System.out.println("Area of the rectangle is: " + area);
    }

    public void calculatePerimeter() {
        perimeter = (width + length) * 2;
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
}


class Square extends ShapeAction{

    public double side;
    public Square(double side){
        this.side =side;
    }

    public void calculateArea(){
        area = side * side;
        System.out.println("Area of the square is: "+area);
    }

    public void calculatePerimeter(){
        perimeter= 4 * side;
        System.out.println("Perimeter of the square is: "+perimeter);
    }

}



class ShapeObject {

    public static void main(String[] args) {

        Circle cr1 = new Circle(3.5);

        cr1.calculateArea();//bug
        cr1.calculatePerimeter();//bug

        System.out.println("========== Rectangle ===============");

        Rectangle rec1 = new Rectangle(3.2, 2.5);

        rec1.calculateArea();//bug
        rec1.calculatePerimeter();//bug

        System.out.println("=========== Square ==================");

        Square sqr1 = new Square(3);
        sqr1.calculateArea();
        sqr1.calculatePerimeter();
    }
}




