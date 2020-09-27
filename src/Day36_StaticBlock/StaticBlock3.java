package Day36_StaticBlock;

public class StaticBlock3 {

    static String name;
    static int num;
    int num2;



    public static void main(String[] args) {

        //if we have to use these variable within the Main Method the we get "Rahman" and "200", but if we want to use
        //them by calling the StaticMethod3, then we get (null)
        name = "Rahman";
        num = 200;

        System.out.println(name);//Rahman, coz we have reinitialized it, unless we get "Adil"
        System.out.println(num);

        StaticBlock3 obj = new StaticBlock3();
        int n = obj.num2 =300;
        System.out.println(n);
    }

    static {
        // Now we can call them through the Static Block and we get the actual result: "Rahman" and "200",
        name = "Adil";
        num = 200;

        StaticBlock3 obj = new StaticBlock3();
        int n = obj.num2 = 900;
        System.out.println("static "+n); // printed first

    }
}
