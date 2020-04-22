package Day20_ArraysContinue;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {

        int []arr1 = {9,8,6,7,4,2,3,5,1};
        Arrays.sort(arr1);//as soon as array is sorted then you know which num is max or num

        System.out.println(Arrays.toString(arr1));

        System.out.println("First minimum number is: "+arr1[0]);
        System.out.println("Second minimum number is: "+arr1[1]);
        System.out.println("First maximum numbers is: "+arr1[arr1.length-1]);
        System.out.println("Second maximum number is: "+arr1[arr1.length-2]);


        char []ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'E', 'C'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        System.out.println("********************************");

        String [] names = {"Rahman", "Adil", "Barzy", "Hardi", "Rawand"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));// alphabetic order

        String [] reverse = new String[names.length];
        int l=0;
        for (int k=names.length-1; k >=0; k--){

            System.out.print(names[k]+" ");

            reverse[l]=names[k]; // if we want to store it in a new variable.
            l++;
        }
        System.out.println();

        System.out.println(Arrays.toString(reverse));

        System.out.println("********************************");


        int [] arr = {3,2,5,-56,43,887,433};
        Arrays.sort(arr);

        int []decending = new  int[arr.length];// Second we need this variable to store the reverse array

        int j=0;//we need this coz otherwise we cannot change int decending[] value as i decreases
                // therefore we need to add j++ each time as i decreases.
        for (int i=arr.length-1; i >=0; i-- ){//first we reverse the given array

            decending[j] = arr[i];
            j++;
        }
        System.out.println("Original array: "+Arrays.toString(arr));
        System.out.println("Decending order: "+Arrays.toString(decending));









    }
}

