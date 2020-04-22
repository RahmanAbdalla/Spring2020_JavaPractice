package Day06_Shorthand_LogicOperators;

public class SingleIfStatement {
    public static void main(String[] args) {

        boolean coldWeather = true;
        if (coldWeather) {

            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");

        }

        boolean coronaDetected = true;
        if (coronaDetected) {
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more Java coding");

        }

        System.out.println("===========================");

        int a = 200;

        boolean evenNumber = a % 2 == 0;
       // boolean oddNumber = a % 2 != 00; // we can remove this by adding ! to the evenNumber at the second if
        if (evenNumber) {
            System.out.println(a + " is an even number: " + evenNumber);
        }
        if (!evenNumber) {
            System.out.println(a + " is an odd number: " + evenNumber);
        }
    }
}