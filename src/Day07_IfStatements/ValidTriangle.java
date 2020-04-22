package Day07_IfStatements;

public class ValidTriangle {
    public static void main(String[] args) {
        /*
        1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
        Write a program that declares three integers as angles and check whether a triangle
        is valid or not.
         */

        int angles1 = 90;
        int angles2 = 50;
        int angles3 = 80;

                // We can use these three ways too

        short sumOfAngles = (byte) (angles1+angles2+angles3);
        // we use short just to practice CASTING

        boolean validTriangle = sumOfAngles ==180;
        boolean res = angles1+angles2+angles3 ==180;

        /* One way to do it
        if (validTriangle){
                    System.out.println("The triangle is valid");
                }
                if (!validTriangle){
                    System.out.println("The triangle is NOT valid");
                }
                 */
                    // OR
        if (angles1+angles2+angles3==180){
            System.out.println("The triangle is valid");
        }
        if (angles1+angles2+angles3 !=180){
            System.out.println("The triangle is NOT valid");
        }

    }
}
