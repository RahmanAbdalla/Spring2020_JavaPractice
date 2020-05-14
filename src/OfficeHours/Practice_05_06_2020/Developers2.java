package OfficeHours.Practice_05_06_2020;

public class Developers2 {

    String name;
    String jobTitle;
    double salary;
    long employeeID;


    public void devsInfo2(String name, String jobTitle, double salary, long employeeID){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    public void actions (){
        System.out.println(name+" is coding and developing the application");
    }

    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", Salary: "+salary+", ID: "+employeeID;
    }
}
