package Day37_Constructors;

import java.util.ArrayList;

public class BankOfBawanoor {

    public static void main(String[] args) {



        ArrayList<Employee> list = new ArrayList<>();

        list.add(HumanResources.employee1);
        list.add(HumanResources.employee2);
        System.out.println(list.get(0));

    }
}
