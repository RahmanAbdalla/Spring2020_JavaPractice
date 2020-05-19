package Day40_Encapsulation;

public class Encapsulation {

    private long ssn;//we cannot access this private variable unless through a getter method

    //getter: it reads ONLY, not setting the value to the private data

    public long getSsn (){
        return ssn;
    }

    // setter: writes only
    public void setSsn (long ssn){
        this.ssn=ssn;
    }


}
