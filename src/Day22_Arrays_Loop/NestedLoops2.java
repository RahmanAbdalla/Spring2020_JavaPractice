package Day22_Arrays_Loop;

public class NestedLoops2 {
    public static void main(String[] args) {


        int [][] arr2D = {  {9,8,7}, {6}, {5,4,3,2,1,0} };
                    //         0      1          2

        //arr2D [0] ==> {9,8,7} . arr2D [0][i] i needs to be repeated three times
        //arr2D [1] ==> {6}     . arr2D [1][i] i needs to be repeated one time
        //arr2D [2] ==> {5,4,3,2,1,0} . arr2D [2][i] i needs to be repeated six times


        for (int i=0; i < arr2D[0].length; i++){// for index arr2D[0] elements {9,8,7}
            System.out.println(arr2D[0][i]);
        }
        for (int i=0; i < arr2D[1].length; i++){// for index arr2D[1] elements {6}
            System.out.println(arr2D[1][i]);
        }
        for (int i=0; i < arr2D[2].length; i++){// for index arr2D[2] elements {5,4,3,2,1,0}
            System.out.println(arr2D[2][i]);
        }
        System.out.println("**************");

                    // but we can do all those loops with a nested loop. LIKE THIS

        for (int k=0; k < arr2D.length; k++) {

            for (int i = 0; i < arr2D[k].length; i++) {// for ALL indexes of arr2D[] elements
                System.out.print(arr2D[k][i]+" ");    // but we MUST change arr2D index to (k)
            }
            System.out.println();// to print each elements in a different line
        }

        System.out.println("///////////////////////////");


        //1 - PRINT  7896012345

        for (int k=0; k < arr2D.length; k++) {

            for (int i = arr2D[k].length - 1; i >= 0; i--) {
                System.out.print(arr2D[k][i] + " ");
            }
        }
        System.out.println();

        System.out.println("&&&&&&&&&&&&&&&&&&");

       //2- PRINT    //5432106987

        for (int k = arr2D.length-1; k >=0;  k--) {

            for (int i = 0; i < arr2D[k].length; i++) {
                System.out.print(arr2D[k][i] + " ");
            }
        }
        System.out.println();

        System.out.println("#####################");

        //3- PRINT    0123456789

        for (int k = arr2D.length-1; k >=0;  k--) {

            for (int i = arr2D[k].length-1; i >=0; i--) {
                System.out.print(arr2D[k][i] + " ");
            }
        }
    }
}
