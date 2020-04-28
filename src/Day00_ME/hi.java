package Day00_ME;

import Resourses.Library;

import java.util.ArrayList;

public class hi {

        public static void main(String[] args) {

            /*  Warm up Tasks
          1.  write a program that can return the sum of all the digits from a string
                      ex:
            input: "a1b2c3"
            output: 6
            (1+2+3= 6)
            input: "Today's date is 04/27/2020"
            output: 17
            (0+4+2+7+2+0+2+0=17) */

            String st = "Today's date is 04/27/2020";
            String num = "0123456789";
            int sum =0;
            for (int k=0; k < num.length(); k++) {
                for (int i = 0; i < st.length(); i++) {
                    if (st.charAt(i) == num.charAt(k)) {
                        sum += Integer.parseInt(""+st.charAt(i));
                    }
                }
            }
            System.out.println(sum);

             /*
          2. write a program that can print the list of integers in reversed order
            ex:
               list=> {1,2,3,4,5}
               output: 5 4 3 2 1

            ArrayList<Integer> list = new ArrayList<>();
            list.add(1); list.add(2); list.add(3); list.add(4);list.add(5);
            System.out.println(list);
            System.out.print("Reversed list: ");
            for (int k = list.size()-1; k >=0; k--) {
                System.out.print(list.get(k)+" ");
            }
*/

            /*  3. write a program that can print out the unique elements from an int array
              HINT: store all the unqie elemenbts of array into a list of integers
              Ex: array==> {1,1,2,3,3,4,5}
              output: {2,4,5}

            int arr [] ={1,1,2,3,3,4,5,7};
            ArrayList<Integer> list = new ArrayList<>();
            int count;
            for (int each : arr){
                count=0;
                for (int each2 : arr){
                    if (each == each2){
                        count++;
                    }
                }
                if (count ==1){
                    list.add(each);
                }
            }
            System.out.println(list);
 */

           /* 4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
            uniques ==> {2,4,5}

            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);  list1.add(1); list1.add(2); list1.add(3); list1.add(3); list1.add(4); list1.add(5);
            ArrayList<Integer> list2 = new ArrayList<>();

            int count3;
            for (Integer each : list1){
                count3=0;
                for (Integer each2 : list1){
                    if (each == each2){
                        count3++; }
                }
                if (count3 ==1){
                    list2.add(each); }
            }
            System.out.println(list2);
*/

          /*  5. write a program that can combine two String arrays into one arrayList
                    ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}

            String arr1[] = {"A", "B", "C"};
            String arr2[] = {"D", "E", "F", "G"};
            ArrayList<String> list = new ArrayList<>();

            for (int i=0; i < arr1.length; i ++){
                list.add(arr1[i]);
            }
            for (int k=0; k < arr2.length; k++){
                list.add(arr2[k]);
            }
            System.out.println(list);

           */
        }
}
