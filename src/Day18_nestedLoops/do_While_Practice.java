package Day18_nestedLoops;

public class do_While_Practice {
    public static void main(String[] args) {
        /*
        print all the even numbers bet 0 - 100in the same line
         */

        int num = 0;

        do {
                System.out.print(num + " ");

                num+=2;

                // OR
       /*     if (num % 2 == 0) {
                System.out.print(num + " ");
            }

        */
        }while (num <=100);

        System.out.println();
        System.out.println("===================================");

        int i = 1;
        do {
            i++; // i is now 2. But if we put the iterator after the print then i starts form 1 NOT 2
            System.out.println(i);

        }while (i <=5);

        System.out.println("===================================");

        int z =1;
        do {
            System.out.println(z);// prints until 3
            if (z == 3){
                break;
            }
            z++;
        }while (z <=5);

        System.out.println("===================================");

        int y = 1;
        do {
            if (y == 3){
                y++; /* if we dont write y++ here then continue will skip all the statement
                so we have to make sure iterator is not skipped. If not it prints up to 2 */
                continue;
            }
            System.out.println(y);
            y++;

        }while ( y <= 5);

        System.out.println("===================================");

        int t = 1; // prints the even numbers
        do {
            if (t % 2 != 0){
                t++;/* we should put the iterator here coz when i is one if we dont add one to
                then it still stay at one and it never become to or over and it keeps skipping */

            continue;
        }
            System.out.print(t+" ");
            t++;

        }while (t <= 100);

    }
}
