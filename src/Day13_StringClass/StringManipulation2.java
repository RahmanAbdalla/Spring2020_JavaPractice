package Day13_StringClass;

import java.io.StringReader;

public class StringManipulation2 {
    public static void main(String[] args) {


        String str = "Cybertek School is the best";

        String schoolName = str.substring(0,8); // or we can write (0,7+1)
        System.out.println("The school name is: "+schoolName);

        String fullName = "Kuzzat Altay";
                 //        0123456789
        String firstName = fullName.substring(0,6);
        String lastName = fullName.substring(7,12);
        System.out.println(firstName);
        System.out.println(lastName);

        String Name = "Murtaza Nazeeri";
        //             0123456789..

        String gmail = Name.substring(0,7)+"_"+Name.substring(8,15)+("@gmail.com");
        System.out.println(gmail);

        ///   OR we can use concat method
        String FirstName = Name.substring(0,7); /*This one is more useful coz we can reuse these
                                                 variables later on */
        String LastName = Name.substring(8,15);
        String gmail2 = FirstName.concat("_").concat(LastName).concat("@gmail.com");
        ////   we can also do this with plus(+) operator
       // String gmail2 = firstName+"_"+lastName+"@gmail.com";

        System.out.println(gmail2);

        String s1 = "I love Java programming language";
                //   1234567890
        String className = s1.substring(7); // here we just add one beginning index
        System.out.println(className);


        /////   Replce method

        String s2 = "I love C# programming";
        String s3 = s2.replace("C#","Java");
        System.out.println(s3);

        String name = "COVID 18";
        String name2 = name.replace("8","9");
        System.out.println(name2);

        String r1 = "I love C#c C# is fun, C# is cool";
        r1 = r1.replaceFirst("C#","Java");
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");
        System.out.println(r2);

    }
}
