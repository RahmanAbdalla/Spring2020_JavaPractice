package Day21_MultiDimentionalArrays;

import java.text.DecimalFormat;

public class Formatting_Decimals {
    public static void main(String[] args) {
                                                   //0 is the whole num and 00 is the one we round up to
        DecimalFormat DF = new DecimalFormat("0.00");//used to round a decimal num to a specific number
                                                // so we can specify it to whatever num we like

        double a = 10.0 / 3.0;
        System.out.println(a);// we get decimal:  3.333333333335

        System.out.println(DF.format(a));// this method by DEFAULT rounds num to the 3rd decimal: 3.333

    }
}
