package Day33_CustomClass;

public class Cat {

    String breed;
    String color;
    String name;
    int age;

    public void sleep() {
        System.out.println(breed+" is sleeping");

    }

    public void eat (String catFood){
        System.out.println(breed+" is eating "+catFood);
    }
    public void drink (String drink){
        System.out.println(breed+" is eating "+drink);
    }

    public void catInfo (String catbreed, String catColor, String catName, int catAge){
        breed = catbreed;
        color = catColor;
        name = catName;
        age = catAge;
    }

    public String toString (){
        String result = "Cat's name is: "+name+", breed is: "+breed+", color is: "+color+", age is: "+age;
        return result;
    }



}
