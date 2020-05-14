package OfficeHours.Practice_05_06_2020;

import Day34_CustomClass.ScrumMaster;
import Day34_CustomClass.Testers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AppleINC {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Onur","Junior Tester",75000,1234);

        Tester tester2 = new Tester();
        tester2.setInfo("Elton John","Junior Tester",75000,1245);

        Tester tester3 = new Tester();
        tester3.setInfo("Rahman","SDET",120000,22222);

        ScrumTeam scrum1 = new ScrumTeam(); // we can use the arraylists in scrumteam class
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);

        //scrum1.fireATester(1245);

        // scrum1.testersTeam // returns the testersTeam arrayList form scrum1
        for( Tester each   : scrum1.testersTeam){ // prints out everysingle tester from scrumteam
            System.out.println(each);
        }


        System.out.println("=====================================");

        Developer dev1 = new Developer();
        dev1.setInfo("Barzy","Senior Developer",120200,1122337);

        Developer dev2 = new Developer();
        dev2.setInfo("Emrah", "Usta Developer", 100000,223232);

        scrum1.hireADeveloper(dev1);
        scrum1.hireADeveloper(dev2);


        // scrum1.fireADeveloper(1122337);

        System.out.println(scrum1.devpTeam.size() );

        for(Developer each : scrum1.devpTeam){ // arraylist of developer in scrum team
            System.out.println(each);
        }



        System.out.println("====================================================");

        //  Scum Team 1
        //Testers
        Testers2 sdet1 = new Testers2();
        sdet1.testersInfo2("Rawand","SDET",113500,1111);

        Testers2 sdet2 = new Testers2();
        sdet2.testersInfo2("Aram","SDET",117000,2222);
        Testers2 sdet3 = new Testers2();
        sdet2.testersInfo2("Adam","SDET",123000,2222);

        //Adding hired Testers to scr1
        ScrumTeam2 scr1 = new ScrumTeam2();
        scr1.hiringTesters2(sdet1);
        scr1.hiringTesters2(sdet2);
        scr1.hiringTesters2(sdet3);

        //Developers
        Developers2 d1 = new Developers2();
        d1.devsInfo2("Rahman","Developer",123000,3333);

        Developers2 d2 = new Developers2();
        d2.devsInfo2("Barzy","Developer",122000,4444);

        Developers2 d3 = new Developers2();
        d3.devsInfo2("Adil","Developer",125000,5555);

        Developers2 d4 = new Developers2();
        d4.devsInfo2("Hunar","Developer",110000,6666);

        //Adding hired Testers to scr1
        scr1.hiringDevs2(d1);
        scr1.hiringDevs2(d2);
        scr1.hiringDevs2(d3);
        scr1.hiringDevs2(d4);

        // Scrum Team2
        //Testers
        Testers2 test1 = new Testers2();
        test1.testersInfo2("Ali","SDET",100000,7777);

        Testers2 test2 = new Testers2();
        test2.testersInfo2("Waise","SDET",130000,8888);

        ScrumTeam2 scr2 = new ScrumTeam2();
        scr2.hiringTesters2(test1);
        scr2.hiringTesters2(test2);
        //Developers
        Developers2 devell1= new Developers2();
        devell1.devsInfo2("Diwan","Developer",125000,87878);

        Developers2 devell2= new Developers2();
        devell2.devsInfo2("Shadman","Developer",117000,100000);

        Developers2 devell3= new Developers2();
        devell3.devsInfo2("Kash","Developer",120000,90900);


        scr2.hiringDevs2(devell1);
        scr2.hiringDevs2(devell2);
        scr2.hiringDevs2(devell3);


       ScrumTeam2 [] allTeam = {scr1, scr2};

       // finding testers whose salary > 120000
       for (int i=0; i < allTeam.length; i++) {
           for (int k = 0; k < allTeam[i].listOfTesters2.size(); k++) {
               if (allTeam[i].listOfTesters2.get(k).salary > 120000) {
                   System.out.println(allTeam[i].listOfTesters2.get(k));
               }
           }
       }

       // finding developers whose salary < 120000
        for (int i=0; i < allTeam.length; i++) {
            for (int k = 0; k < allTeam[i].listOfdevs2.size(); k++) {
                if (allTeam[i].listOfdevs2.get(k).salary < 120000) {
                    System.out.println(allTeam[i].listOfdevs2.get(k));
                }
            }
        }

        System.out.println("=================");

        ArrayList<ScrumTeam2> allTeam2 = new ArrayList<>(Arrays.asList(scr1,scr2));

        // finding testers whose salary > 120000
        for (int i=0; i < allTeam2.size(); i++) {
            for (int k = 0; k < allTeam2.get(i).listOfTesters2.size(); k++) {
                if (allTeam2.get(i).listOfTesters2.get(k).salary > 120000) {
                    System.out.println(allTeam2.get(i).listOfTesters2.get(k));
                }
            }
        }


        // finding developers whose salary < 120000
        for (int i=0; i < allTeam2.size(); i++) {
            for (int k = 0; k < allTeam2.get(i).listOfdevs2.size(); k++ ) {
                if (allTeam2.get(i).listOfdevs2.get(k).salary < 120000) {
                    System.out.println(allTeam2.get(i).listOfdevs2.get(k));
                }
            }
        }



          System.out.println("In Scrum Team1, there are: "+scrum1.devpTeam.size()
                +" Developers and "+scrum1.testersTeam.size()+" Testers");

        System.out.println("In Srum Team2, there are: "+scr1.listOfdevs2.size()
                +" Developers and "+scr1.listOfTesters2.size()+" Testers");




        /*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers
        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000
        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only
         */



    }


}
