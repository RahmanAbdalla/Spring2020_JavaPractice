package Day39_AccessModifier;

public class Employee {

    String name;
    String jobTitle;
    long id;
    double salary;
    char gender;

    public Employee (String name){
        this.name = name;
    }

    public Employee (String name, String jobTitle){
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee (String name, String jobTitle, int id){
        this(name,jobTitle);
        this.id = id;
    }

    public Employee (String name, String jobTitle, int id, double salary){
        this(name,jobTitle,id);
        this.salary =salary;
    }
    public Employee (String name, String jobTitle, int id, double salary, char gender){
        this(name, jobTitle, id, salary);
        this.gender = gender;
    }


        public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", ID: "+id+", Salary: $"+salary+", Gender: "+gender;
    }

}

class EmployeeObject{

    public static void main(String[] args) {

        Employee employee1= new Employee("Hunar");
        Employee employee2= new Employee("Hunar","SDET");
        Employee employee3= new Employee("Hunar","SDET",222111);
        Employee employee4= new Employee("Hunar","SDET",222111,130_000,'M');

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);


    }
}
