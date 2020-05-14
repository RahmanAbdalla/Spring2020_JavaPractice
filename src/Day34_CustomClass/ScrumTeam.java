package Day34_CustomClass;

import OfficeHours.Practice_05_06_2020.PO;
import OfficeHours.Practice_05_06_2020.Tester;

import java.util.ArrayList;

public class ScrumTeam {
    /*
    create a class called ScrumTeam
			Attributes:
				name
				List of Testers,
				List of Developers,
			Actions:
				hireTester
				fireTester
				hireDeveloper
				fireDeveloper
				DailyStandUp
     */
    ArrayList<Testers> listOfTesters = new ArrayList<>();
    ArrayList<Developers> listOfDevelopers = new ArrayList<>();
    ArrayList<ScrumMaster> listOfScrumMaster = new ArrayList<>();
    ArrayList<PO> listOfPO = new ArrayList<>();

    public void hireTesters(Testers testers) {
        listOfTesters.add(testers);
    }

    public void fireTesters (long employeeID){
        listOfTesters.removeIf(p -> p.ID == employeeID);
    }

    public void hireDevelopers( Developers developers){
        listOfDevelopers.add(developers);
     }

    public void fireDevelopers(long employeeID){
        listOfDevelopers.removeIf(p -> p.ID == employeeID);
     }


     public void dailyStandUp(String name, String testers, String developers){
        System.out.println(name+" is hosting Daily Stand-up meeting. SDETs: "+testers+"" +
                "and Developers: "+developers+"are participating.");
     }

     public String toString (){
        return "Developers are: "+listOfDevelopers;
     }


}
