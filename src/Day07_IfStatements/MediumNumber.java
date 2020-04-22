package Day07_IfStatements;

public class MediumNumber {
    public static void main(String[] args) {
        /*
         4. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
         */
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aMedium = a<b && a>c || a>b && a<c;
        boolean bMedium = b<a && b>c || b>a && b<c;
        boolean cMedium = c<b && c>a || c>b && c<a;

        if (aMedium){
            System.out.println(a+" is the medium number");
        }
        if (bMedium){
            System.out.println(b+" is the medium number");
        }
        if (cMedium){
            System.out.println(c+" is the medium number");
        }


    }
}
