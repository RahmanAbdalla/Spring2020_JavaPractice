package Day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class HumanResources {

    // we create them as static so we can sue them outside the main method
    static Developer dev1 = new Developer();
    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();


    static {

        //Inorder to call these info through the Static Block, We MUST give initializations within the Static Block
        dev1.setInfo("Rahman","Developer",123000,9808);
        dev2.setInfo("Adil","Developer",123500,1212);
    }
}
