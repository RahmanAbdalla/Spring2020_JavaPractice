package Day10_Switch_Scanner;

import javax.jws.soap.SOAPBinding;

public class SwitchStatement {
    public static void main(String[] args) {

        byte a = 4;
        float a1 = 4.5f;// cannot be used inside Switch block coz switch accepts single characters only
        long a2 = 34L; // cannot be used inside Switch block
        double a3 = 9.8d; // cannot be used inside Switch block

        switch (a){
            case 1:
                System.out.println("One");;
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 4:
                System.out.println("Hola");
                break;

            default:
                System.out.println("Invalid"); /* we can place this (Default) anywhere. Beginning,
                                               Middle or End */
                break;


        }
    }
}
