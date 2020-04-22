package Day21_MultiDimentionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

      // for (DataType variableName : ArrayName)
        for (   int       eachNum      :  nums){// we usually use this loop when we dont need to
                                                    //provide index numbers
            System.out.print(eachNum+" ");
        }

        System.out.println();
        String [] students = {"Rahman", "Hardi", "Adil"};
        for (String eachName : students){
            System.out.print(eachName+" ");
        }
        System.out.println();

        int []arr1 = {1,2,3,4,5,6,7,8,9,10};

        for (int eachnum : arr1){

            if (eachnum < 5){
                continue;
            }
            System.out.print(eachnum+" ");
        }

        System.out.println("=================================");

        String sentence = "I like Java";

       String st[] = sentence.split(" ");

       String reverse="";
       for (int i=st.length-1; i >=0; i--){

           reverse+=st[i]+" ";
       }
        System.out.println("Original sentence: "+sentence);
        System.out.println("Reversed sentence: "+reverse);

    }
}
