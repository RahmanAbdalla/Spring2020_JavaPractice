package Day34_CustomClass;

public class carpet {

    double width;
    double length;
    double price;
    boolean isPersian;

    public void cutomerOrder(double carpWidth, double carpLength, double carpPrice, boolean persian) {
        width = carpWidth;
        length = carpLength;
        price = carpPrice;
        isPersian = persian;
    }

    public double calCost(){
        double total = (width + length) * price;
        if(isPersian){
            return total+200;
        }else{
            return total;
        }

        //return  (isPersian) ?  total+200 : total;
    }

    public String toString (){
        return "Width "+width+", Lenght "+length+", unit price $"+price+", Total price $"+calCost();
    }
}
