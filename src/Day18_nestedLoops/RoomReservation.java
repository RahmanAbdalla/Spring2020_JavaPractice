package Day18_nestedLoops;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

         /*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */
        int price= 0;
        int kingBed=120;
        int QueenBed=100;
        int SingleBed=80;

        while (true){
            System.out.println("Please choose the type of room you like to reserve");
            String room = scan.nextLine();

            boolean b1 = room.equalsIgnoreCase("king bed")||room.equalsIgnoreCase("queen bed")
                    || room.equalsIgnoreCase("single bed");
            while (!room.equalsIgnoreCase("king bed")&&!room.equalsIgnoreCase("queen bed")
                    && !room.equalsIgnoreCase("single bed")) {
                System.out.println("Invalid entry. Please type in again");
                room = scan.nextLine();
            }
            if (b1 && room.equalsIgnoreCase("king bed")){
                price=kingBed;
            }else if (b1 && room.equalsIgnoreCase("queen bed")){
                price=QueenBed;
            }else {
                price=SingleBed;
            }
            System.out.println("Total price is: "+price);

            System.out.println("Do you want to reserve another room?");
            String ans = scan.nextLine();

            while (! ans.equalsIgnoreCase("yes") && ! ans.equalsIgnoreCase("no")) {
                System.out.println("Invalid entry. Please type Yes/No");
                ans=scan.nextLine();

            }
            if (ans.equalsIgnoreCase("no")) {
                    System.out.println("Thanks for reserving with us");
                    break;
                }
            }

        }
    }



