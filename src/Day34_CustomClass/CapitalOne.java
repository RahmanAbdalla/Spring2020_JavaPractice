package Day34_CustomClass;

import Day24_Methods.Test;
import OfficeHours.Practice_05_06_2020.PO;
import OfficeHours.Practice_05_06_2020.Tester;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {


        Testers tester1 = new Testers();
        tester1.setTestersInfo("Rahman","SDET",34567,11000);

        Testers tester2 = new Testers();
        tester2.setTestersInfo("Adil","SDET",1111,10000);

        Testers tester3 = new Testers();
        tester3.setTestersInfo("Hiwa","SDET",5555,97000);

        ArrayList<Testers> testerList = new ArrayList<>();
        testerList.addAll(Arrays.asList(tester1,tester2,tester3));

// this is how we add new hired testers
        ScrumTeam scrum = new ScrumTeam();
        scrum.hireTesters(tester1);
        scrum.hireTesters(tester2);
        scrum.hireTesters(tester3);

        //This is how we fire testers
        scrum.fireTesters(5555);




        // Adding developers
        Developers dev1 = new Developers();
        dev1.setTDevelopersInfo("Barzy","Developer",23454,120000);

        Developers dev2 = new Developers();
        dev2.setTDevelopersInfo("Hunar","Developer",64533,123000);

        Developers dev3 = new Developers();
        dev3.setTDevelopersInfo("Hardi","Developer",76564,112000);

        ArrayList<Developers> devList = new ArrayList<>();
        devList.addAll(Arrays.asList(dev1,dev2,dev3));


        System.out.println(scrum.listOfDevelopers.size());



        // let's fire a developer
      //  scrum.fireDevelopers(76564);

        System.out.println("=============");


        //This shows what Developers doing: coding
        for (Developers each : devList){
            each.coding();
        }

        scrum.hireDevelopers(dev1);
        scrum.hireDevelopers(dev2);
        scrum.hireDevelopers(dev3);

        System.out.println(scrum.listOfDevelopers.size()+" devs\n"+scrum.listOfTesters.size()+" testers");

        scrum.fireDevelopers(76564);
        System.out.println(scrum.listOfDevelopers.size()+" devs\n"+scrum.listOfTesters.size()+" testers");


        System.out.println("======================");

        // meetings. We use ONLY the names of the testers and the devs we stored in the ArrayList earlier
        ScrumMaster master = new ScrumMaster();
        master.setPoInfo("Rawand","Scrum Master",121000,76574);
        ScrumTeam meeting = new ScrumTeam();


        // first we need to store the names of  in a string
        String devNames="";
        for (int i=0; i < scrum.listOfDevelopers.size(); i++){
            devNames += scrum.listOfDevelopers.get(i).name+", ";
        }
        String testerNames="";
        for (int i=0; i < scrum.listOfTesters.size(); i++){
            testerNames += scrum.listOfTesters.get(i).name+", ";
        }
        scrum.dailyStandUp(master.name,testerNames,devNames);


        // PO's job
        PO po = new PO();
        po.setPoInfo(" Donald Trump","PO",130000,12321);
        System.out.println(po);
        
        po.gatheringRequir();








    }
}
