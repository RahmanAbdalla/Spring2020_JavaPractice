package Day04_JavaRecap;

public class RemainderPractice {
    public static void main(String[] args) {

        int number = 87654;

        boolean oddNumber = number % 2 != 0; // for odd numbers
        boolean evenNumber = number % 2 == 0; // for even numbers

        System.out.println("The number "+number+ " is an odd number: "+oddNumber);
        System.out.println("The number "+number+ " is an even number: "+evenNumber);

        boolean divivsibleBy3 = number % 3 == 0;
        System.out.println("The number "+number+" is divisible by 3: "+ divivsibleBy3);


    }
}
