package Day00_ME;

import java.util.ArrayList;
import java.util.Arrays;

class Main {
        public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {

                return r;
        }


                public static void main (String[]args)
                {

                        ArrayList<Integer> arr = new ArrayList<>();
                        Integer[] nums = new Integer[]{3,4,3,3};
                        arr.addAll(Arrays.asList(nums));

                        System.out.print(removeInst(arr, 3));


                }//end main
        }

        //create your method below
  /*      public static ArrayList<String> removeAll (ArrayList<String> wordList, ArrayList<String> targetWord){

                for (String each : targetWord){
                        wordList.removeAll(Arrays.asList(each));
                }

                return wordList;
        }

   */



        /*
        public static void repeatAL ( ArrayList<Boolean> list){

                System.out.println(list);
                ArrayList<Boolean> list2 = new ArrayList<>();
                for (Boolean each : list) {
                        list2.add(each);
                }
                for (Boolean each2 : list2) {
                        list.add(list.size(),each2);
                }
                System.out.println(list);
        }

         */





