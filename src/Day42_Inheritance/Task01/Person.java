package Day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {


    /*
      create a class called Person
            attributes:  name, age, gender
            methods: eat, walk, sleep, setPersonInfo
     */
    String name;
    char gender;
    int age;


    public void setInfo(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void eat(String food) {
        System.out.println(name + "  eats "+food);
    }

    public void walk() {
        System.out.println(name + " walks");
    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender;
    }
}

class Employee  extends Person{
    /*
    create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString
     */

    double salary; long ID; String jobTitle;

    public void setInfo(String name, int age, char gender, String jobTitle, long ID, double salary) {
        setInfo(name,age,gender);
        this.jobTitle=jobTitle;
        this.ID=ID;
        this.salary=salary;
    }

    public void work(){
        System.out.println(name+" works");
    }


    public String toString(){
        return "Name: "+name+", Job title: "+jobTitle+", ID: "+ID+", Salary: $"+salary;
    }
}  ///// END of Employee class  ///////////

class Student extends Person {
    /*
    		create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
     */
    long studentID; String Class;
    static String schoolName= "Cybertek";

    public void setInfo(String name, int age, char gender, long studentID, String Class) {
        setInfo(name,age,gender);
        this.studentID=studentID;
        this.Class=Class;
    }

    public void attendClass (){
        System.out.println(name+" attends classes");
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", ID: "+studentID+", School Name: "+schoolName+", Class: "+Class;
    }

}

///// END of Employee class  ///////////


//// School Object Class
class school{
    public static void main(String[] args) {
        /*
        create a class called school:
					create 3 objects of student and set their info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
         */

        Student student1 = new Student();
        student1.setInfo("Adil",38,'M',111222,"B18");

        Student student2 = new Student();
        student2.setInfo("Hunar",35,'M',221112,"B18");

        Student student3 = new Student();
        student3.setInfo("Barzy",30,'M',555444,"B18");

        ArrayList<Student> list1 = new ArrayList<>(Arrays.asList(student1,student2,student3));
        System.out.println(list1);

        for (Student each : list1){
            System.out.println("Student name: "+ each.name+", ID: "+each.studentID);
        }

        //Actions
        list1.get(2).eat("rice");
        list1.get(1).sleep();
    }
}

/// Company objects Class
class company{


    /*
		create a class called company:
					create 3 objects of employee and set their info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
     */
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Rahman",30,'M',"SDET",1119900,145_000);

        Employee employee2 = new Employee();
        employee2.setInfo("Hardi",36,'M',"Reporter",100023,150_000);

        Employee employee3 = new Employee();
        employee3.setInfo("Rawand",33,'M',"Driver",899000,160_000);

        ArrayList<Employee> list2 = new ArrayList<>(Arrays.asList(employee1,employee2,employee3));

        for (Employee each : list2){
            System.out.println("Employee name: "+ each.name+", ID: "+each.ID);
        }

        //Actions
        list2.get(0).work();
        list2.get(1).eat("noodles");


    }
}


