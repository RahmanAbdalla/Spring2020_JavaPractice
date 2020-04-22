package Day21_MultiDimentionalArrays;

import java.text.DecimalFormat;

public class AverageNumber {

    public static void main(String[] args) {

        DecimalFormat DF = new DecimalFormat("0.00");

        int my_array[] = {1,2,2};
        int sum = 0;

        for (int i=0; i <= my_array.length-1; i++) {

            sum += my_array[i];
            // int eachNum = arr[i]; We can also use this one
            // sum += eachNum
        }
        System.out.println(sum);
        System.out.println(sum/(double)my_array.length);//in order to get the exact sum
                                                // we need to cast it to double

        System.out.println(DF.format(sum/(double)my_array.length));
    }
}
