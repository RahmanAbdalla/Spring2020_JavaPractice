package Day41_Inheritance.Tesk01;


public class Employee {

    public static String companyName="BoA";
    public double salary;
    public String name;
    public long id;
    public char gender;

    public String jobTitle;


    public void setInfo(String  name, double salary, String jobTitle, long id, char gender ){
        this.name=name;
        this.gender=gender;
        this.id=id;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    public String toString(){
        return "Name: "+name+", Company Name: "+companyName+", Job Title: "+jobTitle+
                ", ID: "+id+", Gender: "+gender+", Salary: $"+salary;
    }

}

class Testers extends Employee {

    /*
    name (inherited)
    salary (inherited)
    id (inherited)
    gender (inherited)
    job title (inherited)
    toString() (inherited)

    reporting()
     */

    public void reportingBug(){
        System.out.println(name+" is reporting bugs");
    }

}

class Developer extends Employee {

  /*  name (inherited)
    salary (inherited)
    id (inherited)
    gender (inherited)
    job title (inherited)
    toString() (inherited)

    fixingBug()
   */

    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }

}

class BusinessAnalyst extends Employee {

    /*  name (inherited)
    salary (inherited)
    id (inherited)
    gender (inherited)
    job title (inherited)
    toString() (inherited)

    writingReqr()
   */


    public void writingReqr(){
        System.out.println(name+" is writing requirements");
    }
}


class employeeObject{

    public static void main(String[] args) {

        // testers
        Testers tester1 = new Testers();
        tester1.setInfo("Adil",120_000,"SDET", 134,'M');


        System.out.println(tester1);

        tester1.reportingBug();


        // Developers


        Developer dev1 = new Developer();
        dev1.setInfo("Hunar",120_000,"SDET", 134,'M');


        System.out.println(dev1);
        dev1.fixingBug();


        // business analyst
        BusinessAnalyst person1 = new BusinessAnalyst();
        person1.setInfo("Barzy",150_000,"Business Analyst",134,'M');

        System.out.println(person1);
        person1.writingReqr();

    }

}
