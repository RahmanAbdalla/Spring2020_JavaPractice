package OfficeHours.Practice_05_06_2020;

public class Testers2 {

    String name;
    String jobTitle;
    double salary;
    long employeeID;


    public void testersInfo2(String name, String jobTitle, double salary, long employeeID){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    public void actions (){
        System.out.println(name+" is testing and creating tickets when finding a bug");
    }

    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", Salary: "+salary+", ID: "+employeeID;
    }
}
