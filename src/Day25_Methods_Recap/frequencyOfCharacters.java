package Day25_Methods_Recap;

import Resourses.Library;

public class frequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AABBCC";

        String nonDup =Library.removeDupl(str);
        String frequency="";

        for (int i = 0; i < nonDup.length() - 1; i++) {
            String ch = "" + nonDup.charAt(i);
            int num = Library.frequency(str, ch);
            frequency += ch + num;

        }
            System.out.println(frequency);

    }
}
