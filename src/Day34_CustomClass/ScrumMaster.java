package Day34_CustomClass;

public class ScrumMaster {

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

    public void hostingMeetings (){
        System.out.println(name+" is hosting Daily Stand-ups and Retro meeting");
    }

    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", Salary: $"+salary+", ID: "+employeeID;

    }
}
