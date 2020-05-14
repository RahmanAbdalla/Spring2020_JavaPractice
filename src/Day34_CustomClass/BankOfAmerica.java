package Day34_CustomClass;

import Day24_Methods.Test;
import sun.jvm.hotspot.oops.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    /*
    crteate a class called BankofAmerica:
				Bank of America in VA is p-lanning to create a scrum teams:
						4 developers 2 testers
				 create a arraylist of scrum team and:
						 1. use the for loop to print out every single employees from BOA' scrum teams
						 2. calculate the total budgets of the screumteam
     */

    public static void main(String[] args) {

        Testers testers []= {new Testers(), new Testers(),new Testers(), new Testers(), new Testers()};

        testers[0].setTestersInfo("Rahman","SDET",12344,100000);

        testers[1].setTestersInfo("Adil","Manula Tester",5432,104000);

        testers[2].setTestersInfo("Barzy","SDET",5432,95000);

        testers[3].setTestersInfo("Hunar","Manula Tester",987654,113000);

        testers[4].setTestersInfo("Hardi","Uber driver",22222,60000);


        // this step shows testers function: Smoke testing
        for (int i=0; i < testers.length; i++){
            testers[i].smokeTesting();
        }



        ArrayList<Testers> alltesters = new ArrayList<>();
        // remove all except SDET
        alltesters.addAll(Arrays.asList(testers));

        alltesters.removeIf(p -> ! p.jobTitle.equals("SDET"));
        System.out.println(alltesters);

        // calculate the total bugdet of the two testers

        double sum=0;
        for (Testers each : alltesters){
            sum+= each.salary;
        }
        System.out.println("Budget needed for SDET is: "+sum);








    }



}
