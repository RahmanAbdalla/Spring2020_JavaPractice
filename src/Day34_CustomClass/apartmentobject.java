package Day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class apartmentobject {

    public static void main(String[] args) {

        apartment apt1 = new apartment();
        apt1.setAptInfo("1D",2,3,false);

        apartment apt2 = new apartment();
        apt2.setAptInfo("4p",1,2,true);

        apartment apt3 = new apartment();
        apt3.setAptInfo("P6",6,4,true);


        List<apartment> aptList = new ArrayList<>(Arrays.asList(apt1,apt2,apt3));

        for (apartment each : aptList){
            System.out.println("Apt name: "+each.aptNum+", Has patio: "+each.hasPatio);
        }

        apt2.price();


    }
}
