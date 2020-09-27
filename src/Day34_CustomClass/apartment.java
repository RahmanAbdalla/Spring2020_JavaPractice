package Day34_CustomClass;

public class apartment {

    String aptNum;
    int floor;
    int rooms;
    boolean hasPatio=true;



    public void setAptInfo(String aptNum, int floor, int rooms, boolean hasPatio){
        this.aptNum=aptNum;
        this.floor=floor;
        this.rooms=rooms;
        this.hasPatio=hasPatio;
    }


    public void price(){
        double price=0;
        if (floor ==1 && hasPatio){
            price+=1600+50;
        }else {
            price+=1600;
        }

        System.out.println("Price for this apartment is: $"+price);
    }

    public String toString(){

        return "Apartment number: "+aptNum+", Floor number: "+floor+
                ", Number of rooms: "+rooms+", Has patio: "+hasPatio;
    }
}
