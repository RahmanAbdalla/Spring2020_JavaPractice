package Day19_Arrays;

public class UniqueCharacters {
    public static void main(String[] args) {

        /*
        write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
         */

        String st = "AABCC";
        String unique = "";
         // to find out how many time a character happen in the string
        int count=0;
        for (int j =0; j <=st.length()-1; j++) {

             count=0; // this count is related to inner loo coz it needs to repeat the count of the letter
            for (int i = 0; i <= st.length() - 1; i++) {
                                  //   'A' instead this we put j value
                if (st.charAt(i) == st.charAt(j)) {// when j is 0 the inner loop checks for A
                //   char ch = st.charAt(i)       // when j becomes 1 inner loop checks for B ...
                    count++;
                }
            }
            if (count == 1){// we only add the character when it occurs ONCE Only
                unique+= st.charAt(j);// this should be outside the inner loop
            }
        }
        System.out.println(count);
        System.out.println(unique);



        System.out.println("********************************");


        String r = "rrahmmann";
        String result = "";

           for (int k=0; k <=r.length()-1; k++) {

               int count2 = 0;
               for (int i = 0; i <= r.length() - 1; i++) {

                   if (r.charAt(i) == r.charAt(k)) {

                       count2++;
                   }

                   }
               if (count2 == 1) {// this if condition relates to teh outer loop NOT the inner loop
                   result += r.charAt(k);
               }

           }
            System.out.println(result);


           String word = "ABBDFFS";
           char ch []= word.toCharArray();
           String res= "";

           for (char each2 : ch) {

               int count3=0;
               for (char each : ch) {
                   if (each == each2) {
                       count3++;
                   }

               }
               if (count3 == 1) {
                   res += each2;
               }
           }
        System.out.println(res);

    }


    }

