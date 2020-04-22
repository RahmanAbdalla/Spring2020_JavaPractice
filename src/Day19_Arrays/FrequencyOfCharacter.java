package Day19_Arrays;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        /*
        write a program that can return the frequency of the characters in a string
		Ex: "AABCC" ==> "A2B1C2"
         */

        String str = "AABCC";
        String result= "";
        String nonDuplicate= "";// ABC


        for (int i=0; i <=str.length()-1; i++){
            if (! nonDuplicate.contains(""+str.charAt(i))){ /*first we need to remove the duplicated
                                                            character */
                nonDuplicate+=str.charAt(i);
            }
        }

        System.out.println(nonDuplicate); // Here we print out the duplicated ones

        //Here we print out the frequency

        for (int k=0; k <=nonDuplicate.length()-1; k++){

            int count=0;
            for (int i=0; i <=str.length()-1; i++){

                if (str.charAt(i) == nonDuplicate.charAt(k)){
                    count++;
                }
            }
            System.out.println(count);
            result += nonDuplicate.charAt(k) +""+count;
        }

        System.out.println(result);


    }


    }
