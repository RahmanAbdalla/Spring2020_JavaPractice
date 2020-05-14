package Day34_CustomClass;

public class Testers {

    /*
    create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
     */
    String name;
    long ID;
    String jobTitle;
    double salary;

    public void setTestersInfo(String testerName, String title, int testerID, double testerSalary){
        name = testerName;
        ID = testerID;
        salary = testerSalary;
        jobTitle = title;
    }
    public void smokeTesting(){
        System.out.println(name+" is smoke testing");

    }
    public void creatingTicketing(){
        System.out.println(name+" is creating tickets");

    }
    public String toString(){
        return "Employee name: "+name+". Job title: "+jobTitle+". Employee ID: "+ID+". Salary: "+salary;
    }
}
