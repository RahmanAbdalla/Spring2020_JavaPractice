package Day40_Encapsulation;

public class Person {

    public String name;

    private long ssn;
    private long ID;


    public Person (String  name){
        this.name=name;
    }

    public long getSsn(){
        return ssn;
    }

    public long getID(){
        return ID;
    }

    public void setSsn(long ssn){
        this.ssn=ssn;
    }
    public void setID(long ID){
        this.ID=ID;
    }
    // we can combine both together
    public void setSSNandID(long ID, long ssn){

      /*  setID(ID);
        setSsn(ssn); */ //Both ways work
        this.ID=ID;
        this.ssn=ssn;
    }

}

class Person_Object{

    public static void main(String[] args) {

        Person prs1 = new Person("Rahman");

        System.out.println(prs1.name);// Rahman
       // System.out.println(prs1.ssn);
       // System.out.println(prs1.ID);

        System.out.println(prs1.getID());// 0
        System.out.println(prs1.getSsn());// 0

        //we need to set value to them through setter
        prs1.setSsn(123456);
        prs1.setID(4543453);
        System.out.println(prs1.getSsn());// 123456
        System.out.println(prs1.getID());// 4543453

        prs1.setSSNandID(222333,66666);


    }
}
