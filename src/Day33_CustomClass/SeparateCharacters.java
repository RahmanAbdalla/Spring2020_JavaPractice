package Day33_CustomClass;

import java.util.ArrayList;

public class SeparateCharacters {
    public static void main(String[] args) {

        /*
        4. write a program that can extract the sepecial characters, digits and alphebets from a string and stores
        them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
         */
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();

        for (Character each : list) {
            if (Character.isDigit(each)) {
                digits.add(each);
            } else {
                if (Character.isLetter(each)) {
                    letters.add(each);
                } else {
                    characters.add(each);
                }
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(characters);
        System.out.println("==============================");
        //Second solution

        //OR we can directly convert str to CharArray and then directly add them to the lists
        char ch [] = str.toCharArray();
        ArrayList<Character> digits1 = new ArrayList<>();
        ArrayList<Character> letters1 = new ArrayList<>();
        ArrayList<Character> characters1 = new ArrayList<>();

        for (char each : ch) {
            if (Character.isDigit(each)) {
                digits1.add(each);
            } else {
                if (Character.isLetter(each)) {
                    letters1.add(each);
                } else {
                    characters1.add(each);
                }
            }
        }
        System.out.println(digits1);
        System.out.println(letters1);
        System.out.println(characters1);

        System.out.println("=================================");
        // Or we can use charAt() Method
        ArrayList<Character> digits2 = new ArrayList<>();
        ArrayList<Character> letters2 = new ArrayList<>();
        ArrayList<Character> characters2 = new ArrayList<>();

        for (int i=0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))) {
                digits2.add(str.charAt(i));
            }else if (Character.isLetter(str.charAt(i))) {
                letters2.add(str.charAt(i));
            } else {
                characters2.add(str.charAt(i));
            }
        }
        System.out.println(digits2);
        System.out.println(letters2);
        System.out.println(characters2);
    }
}

