package Day38_Constructors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class renters {


    String name;
    int numOfousehold;
    int typeOfApt;
    int floor;
    String aptNum;

    int numOfBed;
    int rent;
    double waterBill;
    double electricBill;


    public renters (String name, int numOfousehold, int typeOfApt, int floor, String aptNum, int rent){
        this.name = name;
        this.numOfousehold=numOfousehold;
        this.typeOfApt = typeOfApt;
        this.floor = floor;
        this.aptNum = aptNum;
        this.rent = rent;
    }

    public double getBillInfo(String name, int numOfBed, int rent, double waterBill, double electricBill){
        this.name = name;
        this.numOfBed = numOfBed;
        this.rent =rent;
        this.waterBill = waterBill;
        this.electricBill = electricBill;

        return totalRentCOst();
    }

    public double totalRentCOst (){
        double total= waterBill + electricBill + rent;
        if (numOfBed == 2){
            total += 50;
        }else if (numOfBed > 2){
            total += 75;
        }
        return total;
    }

    public void renterInfo (){
        System.out.println("Name: "+name+", Family members: "+numOfousehold+
                ", Type of Apt rented: "+typeOfApt+", Floor: "+floor+" Rent amount $"+rent);
    }

    public String toString(){
        return "Name: "+name+", Family members: "+numOfousehold+
                ", Type of Apt rented: "+typeOfApt+", Floor: "+floor;
    }
}

class rentersObject{

    static String nameOfApt = "Cybertek View";


    ArrayList<renters> addedResidents = new ArrayList<>();


    //Adding new Residents
    public void adding (renters renter){
        addedResidents.add(renter);
    }

    public void removing (String apartmentNum){

        addedResidents.removeIf(p -> p.aptNum.equalsIgnoreCase(apartmentNum));
    }

}

class apartment{
    public static void main(String[] args) {

        renters renter1 = new renters("Adil",4,2,1,"201",1500);
        renters renter2 = new renters("Barzy",2,1,2,"B12",1400);
        renters renter3 = new renters("Hunar",4,2,1,"1-G",1550);

        System.out.println(renter1);
        System.out.println(renter2);
        System.out.println(renter3);



        rentersObject list = new rentersObject();
        list.adding(renter1);
        list.adding(renter2);
        list.adding(renter3);

        ArrayList<renters> listOfRenters = new ArrayList<>();
        listOfRenters.addAll(Arrays.asList(renter1,renter2,renter3));

        for (renters each : listOfRenters){
            System.out.println(each.name+" is living in "+each.floor +"st/nd floor, Apt number :"+each.aptNum+
                                "/ He's paying $"+each.rent+" for the rent.");
        }

        System.out.println("=============");
        //Print out the rent amount for renter 1
        double totalrent = renter1.getBillInfo(renter1.name,2,renter1.rent,100,80);
        System.out.println(renter1.name+"'s total rent for this month is: $"+ totalrent);

        System.out.println("========================");

        // add or remove residents
        System.out.println("There are "+list.addedResidents.size()+" residents in "+ rentersObject.nameOfApt+" Community");

        list.removing("B12");



    }
}
