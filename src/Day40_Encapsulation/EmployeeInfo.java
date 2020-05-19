package Day40_Encapsulation;

public class EmployeeInfo {

    private long id;
    private double salary;
    private long SSN;
    private String address;

    public static String companyName = "Bank of America";


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long ssn) {
        this.SSN = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}

class employeeObject{

    public static void main(String[] args) {

        EmployeeInfo Abdul = new EmployeeInfo();

        Abdul.setAddress("Lee Overlook");
        Abdul.setId(1234);
        Abdul.setSSN(44399920);
        Abdul.setSalary(140_000);

        System.out.println("Address: "+Abdul.getAddress()+"\nCompany Name: "+Abdul.companyName+
                "\nID: "+Abdul.getId()+"\nSSN: "+Abdul.getSSN()+"\nSalary: $"+Abdul.getSalary());

    }
}
