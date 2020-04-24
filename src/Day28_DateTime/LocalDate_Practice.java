package Day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    public static void main(String[] args) {

        String friends[] = {"Adil", "Hunar", "Barzy"};
        LocalDate birthdays[] = {LocalDate.of(1987, 9, 5), LocalDate.of(1989, 8, 2),
                LocalDate.of(1990, 3, 7),};
//cd
        for (int i = 0; i < friends.length; i++) {

            System.out.print(friends[i] + "'s birthday is: " + birthdays[i] + " ");
            System.out.println();
            System.out.println("Happy birthday guys you fine");
        }
    }
}
