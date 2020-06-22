package Day51_Recap;

public final class cylinder extends Shape implements volume,PI {

    /*
    create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius and height
     */
    public double radius;
    public double height;

    {
        name="Cylinder";
    }

    public cylinder(double radius, double height){
        this.radius = radius;
        this.height =height;
    }


    //A=2πrh+2πr2
    @Override
    public double calculateArea(){
        return (2*PI*radius*height) + (2*PI*radius*radius);
    }

    //Perimeter of cylinder ( P ) =  ( 2 * d ) + ( 2 * h )
    @Override
    public double calculatePerimeter(){
        return (2 * radius) + (2 * height);
    }


    @Override
    // V=πr2h
    public double calculateVolume(){
        return PI*radius*radius*height;
    }




}
