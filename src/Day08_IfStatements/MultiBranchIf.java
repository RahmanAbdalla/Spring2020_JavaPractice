package Day08_IfStatements;

public class MultiBranchIf {
    public static void main(String[] args) {

        double a = 1;

        boolean zero = a == 0;
        boolean negative = a <0;
        boolean positive = a>0;

        if(a==0){
            System.out.println("zero");
        }else if (a > 0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }



        /* Instead of this we can do the above one too
        if (zero){
            System.out.println("zero");
        }
        if (negative){
            System.out.println("Negative");
        }
        if (positive){
            System.out.println("Positive");
        }
        */
    }
}
