package Day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateCharacters2WithLambda {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        char arr [] = str.toCharArray();
        Character ch [] = new Character[arr.length];
        for (int i=0; i < arr.length; i++){
            ch[i] = arr[i];
        }
        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch));
        digits.removeIf(s -> ! Character.isDigit(s));
        System.out.println(digits);

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch));
        letters.removeIf(s -> ! Character.isLetter(s));
        System.out.println(letters);

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList(ch));
        characters.removeAll(letters);
        //OR
       // characters.removeIf(s -> Character.isLetter(s) || Character.isDigit(s));

        characters.removeAll(digits);
        System.out.println(characters);




    }
}
