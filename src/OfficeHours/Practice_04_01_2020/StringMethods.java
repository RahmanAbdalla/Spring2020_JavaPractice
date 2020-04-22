package OfficeHours.Practice_04_01_2020;

public class StringMethods {
    public static void main(String[] args) {

        // charAt()
        String str = "Java";
        //            0123
        char ch1= str.charAt(3);
        System.out.println(ch1);

      //  char ch2 = str.charAt(4);
     //   System.out.println(ch2);//-1: everytime when the indext number is more than the range of
                                // the index the you get "out of range" ERROR message

        String str2= "Java ";
                //    01234
        char ch2 = str2.charAt(4);// SPACE is also considered as a character
        System.out.println(ch2);// returns an empty space

        System.out.println("================================================");


        // length(): returns the total number of chars, as int

        String str3 = "Cybertek School";
        int a = str3.length();
        System.out.println(a);

        char ch3 = str3.charAt(str3.length()-1); // returns l
        //OR char ch3 = str3.charAt(str3.length()-1); // still return l

        System.out.println(ch3);

        // concat(): concatenation
        String str4 = "Cybertek";
                str4.concat(" School");// this ways it doesn't affect the original str4
        System.out.println(str4);// this still shows "Cybertek" coz string is immutable and you
                                // cannot modify it UNLESS we reassign it. Like below
        str4 = str4.concat(" School");
        System.out.println(str4);// returns "Cybertek School. From here now str4 is assigned to
                                    // "Cybertek School" and not "Cybertek" anymore
        String str5 = "Java";
                str5 = str5.concat(" is fun");//becomes: "Java is fun"
        System.out.println(str5);

        // str5+=" is fun"; OR we can do it with plus (+) sign operator. LIKE THIS
       //   System.out.println(str5); // "Java is fun"

        System.out.println("================================================");

        //lowerCase() & toUpperCase(): change the case of the strings to lower or upper cases

        String str6 = "CYBERTEK SCHOOL";
        String lowerCase = str6.toLowerCase();
        System.out.println(lowerCase);

        // OR we can just reassign str6 rather than delcaring a new variable. LIKE this
          //  str6 = str6.toLowerCase();

        String str7 = "rahman";
        String upperCase = str7.toUpperCase();
        System.out.println(upperCase);
        // OR we can just reassign str7 rather than delcaring a new variable. LIKE this
        //  str7 = str7.toLowerCase();

        System.out.println("================================================");

        //trim(): removes unused (white) spaces from the string

        String str8 = "           Cybertek";
        System.out.println(str8); // this returns string with all white spaces
        // we can remove all those unused spaces by using trim()

        //str8.trim(); this still prints the white spaces coz we have'nt reassigned yet
        str8=str8.trim(); // here no spaces coz we reassigned str8
        System.out.println(str8);

        String str9 = "      ";
        str9 = str9.trim();
        System.out.println(str9.length());// 0 coz trim() will remove all the white spaces

        System.out.println("================================================");

        // substring (beginningindex, ending index): creat substring from beginning index untill ending indect(excluding last one)

        String a1= "I like Java";
        //          0123456789.

        String java = a1.substring(7,11); // java
        //  OR  String java = a1.substring(7,10+1);
        // String java1 = a1.substring(7,a1.length()-1+1);

        System.out.println(java);
         String like = a1.substring(2,6); // like
        System.out.println(like);

        String java2 = like+""+java; // likeJava : no SPACE
        // OR we can do it with concat() method
        String java3 = like.concat(" "+java); // like Java : with SPACE

        System.out.println(java2);
        System.out.println(java3);

        // substring(beginning index): creates the substring from the beginning index until the end
        // of the string.
        String a2 = "I like to learn Java";
        String learnJava = a2.substring(10);
        System.out.println(learnJava); // learn Java

        String a3 = "Java"; // JaVa

        String Ja = a3.substring(0,2); //Ja
        String Va = a3.substring(2,3); // v
        Va=Va.toUpperCase(); // V
        String aa = a3.substring(3);// a

        String res=Ja+Va+aa;
        System.out.println(res);// JaVa

        System.out.println("================================================");

        //replace (old str, new str): replaces all the matching ones, returns new string
        String b = "I like C#, C# is cool";
         b = b.replace("C#","Java");
        System.out.println(b);

        //replaceFirst(old str, new str): replace the first occurred matching one, returns new str
        String b1 = "Java is fun, Java is good";
        b1 = b1.replaceFirst("Java","C#");
        System.out.println(b1);

        System.out.println("================================================");

        // index(str): return first matching character, as an int
        String c = "Today W is Wednesday";
        int w = c.indexOf("W"); //first W index
        int w2 = c.indexOf("We");//second W index

        System.out.println(w);
        System.out.println(w2);


        //lastIndexOf(str)
        String i = "Cybertek School, School";
        int s = i.lastIndexOf("S");
        System.out.println(s);


    }
}
