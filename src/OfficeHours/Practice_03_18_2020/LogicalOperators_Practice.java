package OfficeHours.Practice_03_18_2020;

public class LogicalOperators_Practice {
    public static void main(String[] args) {

            //  ||,  &&,  !
        boolean r1 = "Rahman" != "Bad guy"; // true
        System.out.println(r1);

        boolean r2 = "Rahman" == "Good guy"; // false
        System.out.println(r2);

        boolean r3 = 10 >= 9; //  true coz we have || logic
        System.out.println(r3);

        boolean r4 = !false ==  !true; // false
        System.out.println(r4);


        // ||: as long as one condition is true then it returns true

        boolean result1 = 9 != 8 || 9 == 8; // true
                        // true  ||  false  ==> true
        System.out.println(result1);

        boolean result2 = 'a' == 'A'  ||  'A' == 'b';
                        //     false  ||   false  ==>  false
        System.out.println(result2);


        // &&: as long as one condition is false then it returns false

        boolean result3 = 6 > 5  &&  6 < 4;
        System.out.println(result3);


        boolean result4 = !false != false  &&  !true == false;
                        //    true != false  &&  false == false
                        //         true        &&    true   ===> true
        System.out.println(result4);


    }
}
