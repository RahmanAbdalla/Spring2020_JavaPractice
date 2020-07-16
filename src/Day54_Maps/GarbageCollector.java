package Day54_Maps;

public class GarbageCollector {
    public static void main(String[] args) {

        GarbageCollector obj = new GarbageCollector(); // this will not be collected by Garbage Collector coz it has
                                                      // a reference name
        new GarbageCollector(); // This will be collected by the Garbage Collector, coz it doesn't have a reference name

        System.out.println("Done");

        // unreferenced objects:

        String str = new String("Cybertek");
               str = new String("MIT"); // after this line "Cybertek" will be eligible for garbage collector coz
                                                // str is no longer referring to "Cybertek" but to "MIT";

        Integer num = new Integer(123); // Eligible for Garbage collector
                num = new Integer(130);// Not eligible

        // The second way of unreferencing an object is by assigning "null" as the value
        Double d1 = new Double(0.5); // Eligible for Garbage collector
               d1 = null;

        System.out.println(d1); // null

        // finalize() method : it's automatically called by the GC before the obj is called by GC
        GarbageCollector obj2 = new GarbageCollector();
        // obj2.finalize();





    }
}
