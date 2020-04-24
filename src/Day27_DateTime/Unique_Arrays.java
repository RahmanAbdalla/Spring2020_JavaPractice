package Day27_DateTime;

public class Unique_Arrays {

    public static void main(String[] args) {

        int arr2[] = {6, 8, 33, 8, 99, 6, 99};
        int res = unique(arr2);
        System.out.println(res);

        double doubleArr[] = {6.6, 88.9, 33.2, 24.4, 88.9, 6.6, 24.4};
        double result = unique(doubleArr);
        System.out.println(result);

    }


    public static int unique (int [] arr){

        int res=0;
        for (int each2 : arr) {
            int count=0;
            for (int each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count ==1){
                res=  each2;
            }
        }
        return res;
    }

    public static double unique (double [] arr){

        double res=0;
        for (double each2 : arr) {
            int count=0;
            for (double each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count ==1){
                res=  each2;
            }
        }
        return res;
    }
}
