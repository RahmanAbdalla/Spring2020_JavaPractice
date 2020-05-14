package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam2 {


    ArrayList<Testers2> listOfTesters2 = new ArrayList<>();
    ArrayList<Developers2> listOfdevs2 = new ArrayList<>();


    public void hiringTesters2 ( Testers2 testers2){
        listOfTesters2.add(testers2);
    }
    public void firingTesters2 ( long ID){
        listOfTesters2.removeIf(p -> p.employeeID == ID);
    }
    public void hiringDevs2 ( Developers2 developers2){
        listOfdevs2.add(developers2);
    }
    public void firingDevs2 ( Long ID){
        listOfdevs2.removeIf(p -> p.employeeID == ID);
    }

    public String toString(){
        return "Developers are: "+listOfdevs2+"\nTesters are: "+listOfTesters2;
    }
}
