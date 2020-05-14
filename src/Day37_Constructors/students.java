package Day37_Constructors;

public class students {

    String name;
    int age;
    char gender;
    String university;

    // Constructor
    public students (String name, int age, char gender, String university){
        this.name=name;
        this.age = age;
        this.gender =gender;
        this.university= university;

    }/// End of Constructor method

    public void setInfo(String name, int age, char gender, String university) {
        this.name=name;
        this.age = age;
        this.gender =gender;
        this.university= university;


    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+" University: "+university;
    }
}
