package Day42_Inheritance.Task01;


public class Company {
        /*
create a class called company:
                    create 3 objects of employee and set thier info
                    create an array of employees and store all those employee objects
                    use regular for loop to print out each employee' name and employeeID
 */


    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static{
        employee1 = new Employee();
        employee1.setInfo("Messi", 20,'M',"SDET",24043,140_000);

        employee2 = new Employee();
        employee2.setInfo("Hawar", 32,'M',"SDET",'M',130_000);

        employee3 = new Employee();
        employee3.setInfo("Sara", 53,'F',"SDET",'F',120_000);

    }

    public static void main(String[] args) {

        Employee[] employees = {employee1, employee2, employee3};

        for(int i =0; i < employees.length; i++){
            // System.out.println(employees[i]);
            System.out.println("Name: "+ employees[i].name +", ID: "+ employees[i].ID );
        }


    }


}
