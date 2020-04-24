package Day00_ME;

import Resourses.Library;
import sun.jvm.hotspot.jdi.ArrayReferenceImpl;

import java.awt.*;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
public class hi {

    public static void main(String[] args) {

        String friends [] = {"Adil", "Hunar", "Barzy"};
        LocalDate birthdays [] = { LocalDate.of(1987,9,5),LocalDate.of(1989,8,2),
                LocalDate.of(1990,3,7),};

        for (int i=0; i < friends.length; i++) {

                System.out.print(friends[i] +"'s birthday is: "+ birthdays[i]+" ");
            System.out.println();
        }
    }
}
