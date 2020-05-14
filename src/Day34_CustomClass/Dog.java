package Day34_CustomClass;

public class Dog {

    String name;
    String breed;
    String size;
    int age;
    String color;

    public void dogInfo (String dogBreed, String dogSize, int dogAge, String dogColor, String dogName){
       this.breed = dogBreed; // we can also use (this.) keyword
        size = dogSize;
        age = dogAge;
        color = dogColor;
        name = dogName;
    }
    // we Can create our action methods her
    public void eating (String food){
        System.out.println(name+" is eating "+ food);
    }
    public void drinking (String drink){
        System.out.println(name+" is drinking "+drink);
    }



    public String toString (){
        return  name+" is "+age+" years old. Its breed is: "+breed+". Size is: "+size+". " +
                "Color is: "+color;
    }

}
