package Day51_Recap;

public final class circle extends Shape implements PI {

    /*
 4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius
 */

    public double radius;

    static {
        name="Circle";
    }


    public circle(double radius){
        this.radius =radius;
    }



    @Override
    public double calculateArea(){
        return PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter(){
        return 2 * PI * radius;
    }
}
