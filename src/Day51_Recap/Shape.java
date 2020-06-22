package Day51_Recap;

abstract class Shape {

    /*
    1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
     */

    public  String name;
    abstract double calculateArea();
    abstract double calculatePerimeter();

}


/*
  2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double
    3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)
 */

interface volume{

    boolean hasVolume=true;

    double calculateVolume();

}

interface PI {

    double PI = 3.14;

}



