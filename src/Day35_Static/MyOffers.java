package Day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {
 /*
 reate a class called MyOffers
	Create 5 offer objects, and add them into the list of offers, and then:
			1. use for loop to print out the info of each offer
			2. write a program that can only retain the offers if:
					1. the offer is for fulltime position
					2. offer is from your local area
					3. salary is greater than 100K

  */


        offer of1 = new offer();
        of1.setOfferInfo("KY","Microsoft",120000,false);

        offer of2 = new offer();
        of2.setOfferInfo("VA","Bank of America",122000,true);

        offer of3 = new offer();
        of3.setOfferInfo("NJ","Capital One",115000,true);

        offer of4 = new offer();
        of4.setOfferInfo("MD","Wellsfargo",110000,false);

        offer of5 = new offer();
        of5.setOfferInfo("NC","Apple",99000,true);

        ArrayList<offer> offerList = new ArrayList<>();
        offerList.addAll(Arrays.asList(of1,of2,of3,of4,of5));

        //    offerList.removeIf(each -> ! each.isFullTime);
       // System.out.println(offerList);


        ArrayList<offer> accepted = new ArrayList<>();

        for (int i=0; i < offerList.size(); i++){
            if (offerList.get(i).location.equals("VA") && offerList.get(i).salary > 100000 &&
                    offerList.get(i).isFullTime) {

                accepted.addAll(Arrays.asList(offerList.get(i)));
            }
        }

        System.out.println(accepted);

    }

}
