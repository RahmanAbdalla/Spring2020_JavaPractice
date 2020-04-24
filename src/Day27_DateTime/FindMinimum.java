package Day27_DateTime;

public class FindMinimum {
    public static void main(String[] args) {

    int arr []= {6,5,33,8,99,4,1,12};
    int min = minArr(arr);
        System.out.println("Minimum array is: "+min);

    double doubleArr [] = {5.5, 7.3, 6.9, 10.0, 2.4, 11.2 };
    double minDouble = minArr(doubleArr);
        System.out.println("Minimum double array is: "+minDouble);

        System.out.println("===============");


}// end of Main Method

    public static int minArr (int [] arr){

        int min=arr[0];
        for (int each : arr){
            if (each < min){
                min = each;
            }
        }
        return min;
    }


    public static double minArr (double [] arr) {

        double minDouble=arr[0];
        for (double each : arr){
            if (each < minDouble){
                minDouble = each;
            }
        }
        return minDouble;
    }

}
