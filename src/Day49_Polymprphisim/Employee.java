package Day49_Polymprphisim;

import OfficeHours.Practice_05_06_2020.Tester;

import java.util.ArrayList;
import java.util.Arrays;

/*
task:
    1. create an abstract class named Employee:
            attributes: name, id, jobTitle, Salary,...
            abstract method: work()
    2. create class named Tester that inherits from emplyee
    3. create class named Developer that inherits from emplyee
    4. create a class named ScrumTeam:
            create an arraylist and store 3 testers and 4 developers

 */
public abstract class Employee {

    public String name; public long id; public String jobTitle; public double salary;
    public static String companyName="BoA";

    abstract void work();

    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", ID: "
                +id+", Salary: $"+salary+", Company Name: "+companyName;
    }
}


// Testers Class
class Testers extends Employee{

    public Testers (String name, String jobTtile, long id, double salary){
        this.name=name; this.jobTitle=jobTtile; this.id=id; this.salary=salary;
    }
    public void work(){
        System.out.println(name+" is tests codes, finds bugs and creates bug tickets");
    }

}


// Developers Class
class Developers extends Employee{

    public Developers (String name, String jobTtile, long id, double salary){
        this.name=name; this.jobTitle=jobTtile; this.id=id; this.salary=salary;
    }

    public void work(){
        System.out.println(name+" writes codes and fixes bugs");
    }

}

// Scrum Master Class
class ScrumMaster extends Employee{

    public ScrumMaster(String name, String jobTitle, long id, double salary){
        this.name=name; this.jobTitle=jobTitle; this.id=id; this.salary=salary;
    }

    public void work(){
        System.out.println(name+" makes sure the team performs to their best" +
                " removes blockers and hosts some meetings");
    }
}


// PO Class
class PO extends Employee {

    public PO(String name, String jobTitle, long id, double salary){
        this.name=name; this.jobTitle=jobTitle; this.id=id; this.salary=salary;
    }

    public void work(){
        System.out.println(name+" gathers requirements, defines user stories and hosts some meetings");
    }
}



// Scrum Team Class
class ScrumTeam{

    ArrayList<Testers> testeList = new ArrayList<>();
    ArrayList<Developers> devList = new ArrayList<>();

    public void addTesters(Testers name){
        testeList.add(name);
    }

    public void addDevs(Developers name){
        devList.add(name);
    }

    public void removeTester(){
        testeList.removeIf(each -> each.salary < 120000);
    }

    public void removeDev(){
        devList.removeIf(each -> each.salary < 130000);
    }
}

class objects {

    public static void main(String[] args) {

        System.out.println("================== Testers ==================");

        Testers tester1 = new Testers("Adil","SDET", 2463, 125000);
        Testers tester2 = new Testers("Hunar","SDET", 3233, 110000);
        Testers tester3 = new Testers("Barzy","SDET", 1122, 115000);

        System.out.println(tester1);
        System.out.println(tester2);
        System.out.println(tester3);

        tester1.work();

        System.out.println("================== Developers ==================");

        Developers dev1 = new Developers("Rahman","Developer",22331,129000);
        Developers dev2 = new Developers("Hardi","Developer",1010,132000);
        Developers dev3 = new Developers("Rawand","Developer",11230,131000);

        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(dev3);
        dev1.work();

        System.out.println("================== Scrum Master ==================");
        ScrumMaster master = new ScrumMaster("Muhtar","Scrum Master", 3332, 130000);
        master.work();

        System.out.println("================== PO ==================");
        PO po = new PO("Kuzzat","PO",1111,140000);
        po.work();


        System.out.println("***************************");

        ScrumTeam scrumTeam = new ScrumTeam();

        // Adding developers
        scrumTeam.addTesters(tester1);
        scrumTeam.addTesters(tester2);
        scrumTeam.addTesters(tester3);

        // Adding testers
        scrumTeam.addDevs(dev1);
        scrumTeam.addDevs(dev2);
        scrumTeam.addDevs(dev3);



        // We use polymorphisim to create an array of Employee
        Employee [] EmployeeList = {tester1, tester2, tester3, dev1, dev2, dev3, master, po};

        //This prints out number of employees in the team
        System.out.println("There are "+EmployeeList.length+" employees in the team: "+
                scrumTeam.devList.size()+" testers, "+scrumTeam.devList.size()+" developers, 1 scrum master and 1 PO");

        System.out.println("=============");

        // This prints out info about every member of the team: name & job title.
        for (int i=0; i < EmployeeList.length; i++){
            System.out.print(EmployeeList[i].name+": "+EmployeeList[i].jobTitle+"");
            System.out.println();
        }


        System.out.println("=========================");
        // This line shows how many testers and developers are in the team
        System.out.println("Testers are "+scrumTeam.testeList.size()+" testers and "+scrumTeam.devList.size()+" developers in the team");

        // Now we remove testers whose salary is lower than 120k, and developers whose salary is lower than 130k.
        scrumTeam.removeTester();
        scrumTeam.removeDev();
        System.out.println("Testers are "+scrumTeam.testeList.size()+" testers and "+scrumTeam.devList.size()+" developers in the team");




    }
}


