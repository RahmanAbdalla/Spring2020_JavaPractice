package Day35_Static;


public class studentObject {
    public static void main(String[] args) {


        student stu1 = new student();
        stu1.setInfo("Elshan", 12345,90.5);

        student stu2 = new student();
        stu2.setInfo("Alin",54321,95);

        student stu3 = new student();
        stu3.name = "Kara";

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3); // ID: 0 , GPA: 0  coz we haven't set their info
    }
}
