package Day14_StringClass;

public class StringManipulations {
    public static void main(String[] args) {
        String str = "I like to J learn Java. I like to watch movie Jumanji";

        int a1 = str.indexOf("J");
        System.out.println(a1);

        int a2 = str.indexOf("Jum");
        System.out.println(a2);

        int a3 = str.indexOf(" I")+1;//if we dont add 1 then we'll get index of the space
        System.out.println(a3);

        //// lastIndexOf() ==> it returns index of the last occurred character
        String s = "I like Java, and I like reading";
        int a4 = s.lastIndexOf("I");//coz this is the last I int the sentence
        System.out.println(a4);

        int a5= s.lastIndexOf("l");
        System.out.println(a5);


        String z = "I like C#, C# is cool";
        int c2 = z.lastIndexOf("C#");
        System.out.println(c2);

        String x = "I like Java, Java is fun, Java programming is fun";
        //        0123456789123456789123456789
        int d1 = x.indexOf(" J")+1;
        System.out.println(d1);

        int d2 = x.indexOf(", J")+2;
        System.out.println(d2);

        int d3 = x.indexOf("n, J")+3; // OR
        System.out.println(d3);

        int d4 = x.indexOf("Java p");// OR
        System.out.println(d4);

        char ch1 = x.charAt(9);
        System.out.println(ch1);

    }
}
