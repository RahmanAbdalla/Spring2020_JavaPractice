package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {

            if (i % 3 == 0 || i % 5 == 0) {

                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("=========================");

        String name = "level eye";
        // 012345
        String reverse = "";
        for (int a = name.length() - 1; a >= 0; a--) {
            reverse += name.charAt(a);
         //   reverse += name.charAt(i, i+1);
                            //   i = 3, 4 : when i = 3 we need to add one to i coz it prints
                            //   i = 2, 3  the index num after i which is 4
                            //   i = 1, 2
                            //   i = 0, 1
        }
        if (reverse.equalsIgnoreCase(name)) {
            System.out.println(reverse + " is a palindrome word");
        }else {
            System.out.println(reverse+" is NOT a palindrome word");
        }

    }
}
