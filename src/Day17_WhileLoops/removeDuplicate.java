package Day17_WhileLoops;

import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        write a program to know how many Java words are in a sentence
         */

        String str1= "Java Java Java Java is cool";
        int count=0;

        while (str1.contains("Java")){
            count++;

            str1 = str1.replaceFirst("Java","");/* after counting the first "Java"
    we need to replace the "Java" it won't appear again in the sentence coz otherwise it's going
    to check the sentence and find the first "Java" again */

        }
        System.out.println(count);



        String st = "DBDDFGKDD";
                  // 012345678

        String result = "";

        int i = 0;//012345678
        while (!result.contains("" + st.charAt(i))) {

            result += st.charAt(i);// DB--FGK--
            i++;
        }
        System.out.println(result);


    }
}
