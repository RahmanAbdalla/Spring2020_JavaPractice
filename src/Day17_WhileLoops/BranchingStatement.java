package Day17_WhileLoops;

public class BranchingStatement {
    public static void main(String[] args) {


        // System.exit(0): stops the entire program immediately.
        for (int i=0; i<5; i++){
            if (i%2 !=0){
                System.exit(0);
            }
        }

        System.out.println("Hello");

/*

        if  (9 < 10){
            System.exit(0);  //true
        }
        System.out.println("Hi");//this one doesn't get executed coz the condition is true

 */
    }
}
