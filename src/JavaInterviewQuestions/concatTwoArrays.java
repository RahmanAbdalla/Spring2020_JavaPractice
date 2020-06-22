package JavaInterviewQuestions;

import sun.jvm.hotspot.oops.Array;

import java.util.Arrays;

public class concatTwoArrays {
    public static void main(String[] args) {

        int a1[] = {1,2,3};
        int a2[] = {4,5,6,7,8,9};

        int newA [] = new int[a1.length+a2.length];

        for (int i=0; i < a1.length; i++){
            newA[i] = a1[i];
        }

        for (int k=0; k < a2.length; k++){
            newA[a1.length+k] = a2[k];
        }

        System.out.println(Arrays.toString(newA));
    }
}
