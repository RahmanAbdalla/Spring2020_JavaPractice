package Day22_Arrays_Loop;

public class NestedLoop3 {
    public static void main(String[] args) {

        int [][] numbers = { {1,2,3}, {4,5,6,7,8,9}, {10,11,12,13,14}, {15,16,17,18,19,20,21}};
                    //          0          1                2                  3
        // print all even numbers in the same line
       //2-

        int count=0;
        for (int k=0; k <numbers.length; k++){

            for (int i=0 ; i < numbers[k].length; i++) {

                if(numbers[k][i] % 2 ==0){
                    System.out.print(numbers[k][i] +" ");
                }else{
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Odd count is: "+count);


    }

}
