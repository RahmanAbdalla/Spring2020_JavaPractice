package Day34_CustomClass;

public class Developers {

    /*
    reate a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()
     */

    String name;
    long  ID;
    String jobTitle;
    double salary;

    public void setTDevelopersInfo(String devName, String title, int devID, double devSalary){
        name = devName;
        ID = devID;
        salary = devSalary;
        jobTitle = title;
    }
    public void coding(){
        System.out.println(name+" is coding");

    }
    public void fixingBugs(){
        System.out.println(name+" is fixing bugs");

    }

    public String toString (){
        return "Employees's name: "+name+". Job title: "+jobTitle+". ID: "+ID+". Salary: "+salary;
    }
}
