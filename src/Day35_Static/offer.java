package Day35_Static;

public class offer {
    /*
   Create a class called Offer that has:
   instance fields :
           location, company, salary , isFullTime
   instance methods :
       setOfferInfo: can set the location, company, salary , isFullTime of the offer
       toString -- return all info about offers
    */
    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setOfferInfo (String locName, String comName, double sal, boolean isFT ){
        location = locName;
        company = comName;
        salary = sal;
        isFullTime = isFT;
    }

    public String toString (){
        return "Location: "+location+". Campany name: "+company+". " +
                "Salary: $"+salary+". is Full Time: "+isFullTime;
    }

}
