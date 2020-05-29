package Resourses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPresentation {

    public static void main(String[] args) {

        //1-  Write a program that can find the maximum and minimum number from an int Array

        int arr1[] = {40, 2, -7, 5, 9, 46, 2, 4, 90, 73,};
        Arrays.sort(arr1);
        System.out.println("Sorted Array: " + Arrays.toString(arr1));
/*
        int max=0;
        for(int each: arr1)

            if(each > max)

                max = each;
        System.out.println(max);

 */

        System.out.println("Maximum number is: " + arr1[arr1.length - 1]);
        System.out.println("Minimum number is: " + arr1[0]);

        System.out.println("===================================");

        //2-Write a program that can sort an int array in Ascending order without
        // using the sort method of the Arrays class

        int arr2[] = {3,1,2};
/*
        int temp1=0;
        for (int i=0; i < arr2.length; i++){ //To take one element

            for (int k=i+1; k<arr2.length; k++){ // compare the element that have been taken in a[i]

                if (arr2[i] < arr2[k]){//To Swap if element compared is greater than other element

                    temp1 = arr2[i];
                    arr2[i] = arr2[k];
                    arr2[k] = temp1;
                }
            }
            System.out.print(arr2[i]);
        }

 */
        ArrayList<Integer> list = new ArrayList();
        for (int each : arr2) {

            list.add(each);

        }
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);//we find the smallest


                    list.set(i, list.get(j));

                    list.set(j, temp);

                }
            }
        }

        for (int i = 0; i < list.size(); i++) {

            arr2[i] = list.get(i);

        }

        System.out.println(Arrays.toString(arr2));



        System.out.println("======================================");

        //3- Write a program that can sort an int array in descending order without
        // using the sort method of the Arrays class

        int arr3[] = {40, 2, -7, 5, 9, 46, 2, 4, 90, 73,};

        int temp1=0;
        for (int i=0; i < arr2.length; i++){ //To take one element

            for (int k=i+1; k<arr2.length; k++){ // compare the element that have been taken in a[i]

                if (arr2[i] < arr2[k]){//To Swap if element compared is greater than other element

                    temp1 = arr2[i];
                    arr2[i] = arr2[k];
                    arr2[k] = temp1;
                }
            }
            System.out.print(arr2[i]);
        }

        ArrayList<Integer> list1 = new ArrayList();

        for(int each: arr3) {

            list1.add(each);

        }

        for (int i = 0; i < list1.size(); i++) {

            for (int j = 0; j < list1.size(); j++) {

                if (list1.get(i) > list1.get(j)) {

                    Integer temp = list1.get(i);

                    list1.set(i, list1.get(j));

                    list1.set(j, temp);

                }

            }

        }

        for(int i=0; i < list1.size(); i++) {

            arr3[i] = list1.get(i);

        }
        System.out.println(Arrays.toString(arr3));


        System.out.println("==========================================");


        //4 Write a program to move all the zeros to  last indexes of the array (Do Not Use Sort Method)


        int arr4 [] = {0,3,0,5,7,0, 10,9,4};
        ArrayList<Integer> listarr = new ArrayList<>();

       // Integer countZero=0;// to count the zeros
        for (int each : arr4){

                listarr.add(each);// add the arr into list coz it's easier to work with

               // if (each ==0){// count the zeros here, we use it later
                //    countZero++;
              //  }
        }

        listarr.removeIf(p-> p ==0);

        arr4 = new int[arr4.length]; // we need to reinitialize the array without giving it any value so it becomes
                                    ///[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        System.out.println(Arrays.toString(arr4));

        for (int i=0; i < listarr.size(); i++){
            arr4[i] = listarr.get(i);
        }

        System.out.println(Arrays.toString(arr4));


        System.out.println("========================================");


     // 5-
        // Write a program that can concat two arrays

        int arr6 [] = {1,2,3,4,1,9};
        int arr7 [] = {5,6,7,8,7,4,6,2,4,5,6};

        int arrNew [] = new int[arr6.length + arr7.length];

        for (int i=0; i < arr6.length; i++){
            arrNew[i]=arr6[i];
        }

        for (int k=0; k < arr7.length; k++){
            arrNew[arr6.length+k]=arr7[k];
        }

        System.out.println(Arrays.toString(arrNew));





    }
}

