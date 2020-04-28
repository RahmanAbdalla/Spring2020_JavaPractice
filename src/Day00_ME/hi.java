package Day00_ME;

import Resourses.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Main {

        public static int sum(ArrayList<Integer> ints)
        {
                //write code here
                int sum=0;
                for (Integer each : ints){
                        sum+=each;
                }
                return sum;
        }
}




