package Day00_ME;

import Resourses.Library;
import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list1 =  new   ArrayList<>( );
        list1.addAll(Arrays.asList(4,12,3,4,60,60,70,70,40,50,50));



        int max = Library.maxArrayList(list1);
        System.out.println(max);

    }

}




                //String find_tst = search(arr,"foo");
              //  System.out.print(find_tst);//foo bar


        //end main


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





