package Day00_ME;

import Resourses.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Main {
        public static String combineRs(String[] r1,String[] r2)
        {
                ArrayList<String> combine = new ArrayList<>();
                for (String each : r1){
                        combine.add(each);
                }
                for (String each2 : r2){
                        combine.add(each2);
                }
                String res = "";
                for (String each3 : combine){
                     res+=each3;
                }
                return res;
        }

        public static void main(String[] args) {

                String s1 [] = {"foo"};
                String s2 [] = {"bar"};

                String res = combineRs(s1,s2);
                System.out.println(res);
        }
}




