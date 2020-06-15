package Day47_Abstraction;

/*
Task02:
		1. create an abstract class called Employee
				attributes: name, age, gender, salary, jobtitle
				methods:
						abstract methods: work()
						instance method: toString()
		2. create two sub classes of the Employee:
									1. Tester
									2. Developer
					each class MUST have constructors to initialize the attributes
 */
public abstract class Employee {

    String name; int age; char gender; double salary; String jobTitle; static String companyName="BoA";

    abstract void work();

    public void setInfo(String name, int age, char gender, double salary, String jobTitle){
        this.name=name; this.age=age; this.gender=gender; this.salary=salary; this.jobTitle=jobTitle;
    }
    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+
                ", Salary: "+salary+", Job Title: "+jobTitle+", Company Name: "+companyName;
    }

}

class testers extends Employee{

    public testers (String name, int age, char gender, double salary, String jobTitle ){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void work(){
        System.out.println(name+" is testing and creating tickets");
    }
}

class developers extends Employee{


    public developers (String name, int age, char gender, double salary, String jobTitle ){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void work(){
        System.out.println(name+" is coding and fixing bugs");
    }
}


class employeeObjects{

    public static void main(String[] args) {

        testers tester1 = new testers("Adil", 37, 'M', 122000, "SDET");

        System.out.println(tester1);
        tester1.work();

        developers dev1 = new developers("Hunar",35,'M',130500,"Developer");
        System.out.println(dev1);
        dev1.work();
    }
}
