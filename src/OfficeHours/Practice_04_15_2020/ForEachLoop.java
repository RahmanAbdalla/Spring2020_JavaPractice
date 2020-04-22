package OfficeHours.Practice_04_15_2020;

public class ForEachLoop {
    public static void main(String[] args) {

        /*
        for each loop
            for(DataType variableName : ArrayName{

            }
         */

        int [] arr = {1,2,3,4};

        for (int each : arr){

            if (each ==3){
              //  continue; // result: 1 2 4: we can apply continue and break statement too here
                break; // result: 1 2
            }
            System.out.println(each);
        }
        System.out.println("==================");

        int [] arr2 = { 1,2,3,4,5,6,7,8,9,10};

            for (int each : arr2){

                if (each % 2 != 0 ){
                    continue;
                }
                System.out.println(each);
            }

            // we CANNOT reverse it unless using regulat for loop
        System.out.println("***************");
            for (int i=arr2.length-1; i >=0; i--){
                System.out.print(arr2[i]+" ");
            }
        }
}
