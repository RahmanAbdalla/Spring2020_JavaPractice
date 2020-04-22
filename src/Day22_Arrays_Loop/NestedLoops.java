package Day22_Arrays_Loop;

public class NestedLoops {
    public static void main(String[] args) {

        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H', 'I'}, {'J', 'K'}};

        // this is one way of printing each index of arr2D. a for loop for each


        // arr2D[0] ==> {'A','B'}

        for (int i = 0; i < arr2D[0].length; i++) {//getting 1D arrays elements
            System.out.println(arr2D[0][i]);// {'A','B'}
        }    // here we've changed arr2D index to k.

        // arr2D[1] ==> {'C','D','E'}

        for (int i = 0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[1][i]);//{'C','D','E'}
        }

        for (int i = 0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[1][i]);// {'F','G', 'H','I'}
        }


        System.out.println("===================");

        // but we can do all the repeated steps with a nested loop, LIKE BELOW:

        // *** VERY IMPORTANT ****
            /* coz these steps are repeated several times so we need to put it in another loop
            so we replace arr2D's index num with a variable like (k) in the outer loop
             so we don't need to worry about changing arr2D length.*/

        for (int k = 0;  k < arr2D.length; k++) {// k represents arr2D index
            for (int i = 0; i < arr2D[k].length; i++) {
                System.out.println(arr2D[k][i]);// {'F','G', 'H','I'}
            }
        }
    }
}