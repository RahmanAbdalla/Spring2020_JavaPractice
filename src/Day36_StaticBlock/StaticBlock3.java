package Day36_StaticBlock;

public class StaticBlock3 {

    static String name;
    static int num;



    public static void main(String[] args) {

        //if we have to use these variable within the Main Method the we get "Rahman" and "200", but if we want to use
        //them by calling the StaticMethod3, then we get (null)
        name = "Rahman";
        num = 200;

        System.out.println(name);
        System.out.println(num);
    }

    static {
        // Now we can call them through the Static Block and we get the actual result: "Rahman" and "200",
        name = "Rahman";
        num = 200;
    }
}
