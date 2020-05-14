package Day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {


        String classmates [] = {"Barzy", "Adil", "Hunar", "Iman", "Hardi"};
                            //     0        1       2        3       4

        // datatype MUST match with the datas we store inside the brackets

        String name1 = classmates[1];
        System.out.println(name1);//Adil

        String result="";
        for (int i=0; i < classmates.length; i++) {
                       // i <= 4   We can also do this
                 result +=classmates[i]+" ";
        }
        System.out.println(result);


        String[]emails = {"cybertek@yahoo.com", "cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com"};

        // print put all the users who registered with their gmails.
        // max: 4

       int count=0;
       ///String email="";
        for (int i=0; i <=3; i++){

           String email = emails[i];

            if (email.endsWith("@gmail.com")){
                count++;
                System.out.println(count+" user is found");
                System.out.println(email);

            }
        }

    }
}
 /* String name = "rahman";
        int s1 = name.length()/2;
        String m = ""+s1;
        System.out.println(s1);

        */