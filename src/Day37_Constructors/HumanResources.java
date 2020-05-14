package Day37_Constructors;

public class HumanResources {

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();


    static {
        employee1.setInfo("Rahman",12345,4435676,"SDET",120000,'M');
        employee2.setInfo("Adil",2213234,4455335,"SDET",121000,'M');
        employee3.setInfo("Hardi",41222,4564635,"SDET",119000,'M');
        employee4.setInfo("Hunar",3453534,6577434,"SDET",125000,'M');
        employee5.setInfo("Adil",3334455,111111,"SDET",122500,'M');

    }
}

