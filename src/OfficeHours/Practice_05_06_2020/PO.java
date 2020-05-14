package OfficeHours.Practice_05_06_2020;

public class PO {


    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setPoInfo (String name, String jobTitle, double salary, long employeeID){

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;

    }

    public void gatheringRequir (){
        System.out.println(name+" is gathering all the necessary requirements for starting SDLC process");
    }

    public void hostingMeetings (){
        System.out.println(name+" is hosting both Grooming and Sprint Planning meeting");
    }

    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", Salary: $"+salary+", ID: "+employeeID;

    }
}
