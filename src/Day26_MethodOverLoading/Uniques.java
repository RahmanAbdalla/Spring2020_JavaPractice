package Day26_MethodOverLoading;

public class Uniques {
    public static void main(String[] args) {


        String str = "ABBBCDB";

        String result = ""; //ACD
        for(int i=0; i < str.length(); i++){
            int num = frequency(str, str.charAt(i) );
            if( num == 1){
                result += str.charAt(i);
            }
        }


        System.out.println(result);

        String str2 = "Cybertek";
        String result2 =  uniques(str2);
        System.out.println(result2);



    }

    public static String uniques(String str){ // "AABCDCD"
        String result = ""; //ACD
        for(int i=0; i < str.length(); i++){
            int num = frequency(str, str.charAt(i) );
            if( num == 1){
                result += str.charAt(i);
            }
        }

        return result;
    }

    /* OR We can use FOR EACH Loop
    public static String uniques2(String str) {
        String uniq = "";
        char[] arr = str.toCharArray();
        for (char each : arr) {
            if (frequency(str, each) == 1) {
                uniq += each;
            }
        }
        return uniq;
    }

     */

    public static int frequency(String words, char ch) {

        //  String arr [] = words.split(" ");
        char ch1 [] = words.toCharArray();
        int count=0;
        for (char each : ch1){
            if (each == ch){
                count++;
            }
        }
        return count;

    }



}
