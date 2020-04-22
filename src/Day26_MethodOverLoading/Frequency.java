package Day26_MethodOverLoading;

public class Frequency {
    public static void main(String[] args) {

        String word = "AABDHDDKKDDD";
        char ch = 'D';
        int frequnecy = frequency(word,ch);
        System.out.println(frequnecy);



    }

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
