package Day35_Static;

public class student {

    String name;
    long ID;
    double gpa;

    static String schoolName = "Cybertek";

    public void setInfo ( String name, long ID, double gpa){
        this.name = name;
        this.ID = ID;
        this.gpa = gpa;
    }

    public static void printSchool(){
        System.out.println(schoolName);
    }

    public String toString(){
        return "Name: "+name+", ID: "+ID+", GPA: "+gpa+" School Name: "+schoolName;
    }
}
