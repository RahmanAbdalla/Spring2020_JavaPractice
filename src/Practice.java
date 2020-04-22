import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] arr1 = { "Rahman", "Adil", "HArdi", };
        String [] arr2 = { "Tester", "Developer", "PO", "Scrum Master"};


        //Sorting
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr2));//alphabetic order

        //equalizing arrays
       // arr2 = arr1;
        System.out.println(Arrays.toString(arr2));//arr2 gets arr1 values / 4 to 3

        //retrieving array values
        //PRINT  "Rahman is a Developer ==>

        System.out.println(arr1[2]+" is a "+ arr2[1]);//arr2[1] print PO coz we sort it in line 11

        //replacing (revalue) arrays value
        arr2[0]=arr1[2];//replace "Tester" with "Rahman"
        System.out.println(Arrays.toString(arr2));

        arr1[0] = "Barzy";//replace "Adil" with "Barzy"
        System.out.println(Arrays.toString(arr1));



        String [] arr3 = { "Muhtar", "PO", "Asiya", "Saim", "developer" };
        String [] arr4 = { "Tester", "Developer", "Asiya", "Scrum Master", "Muhtar"};
        //PRINT shortest or longest value
        //arr2 : shortest ==> PO / longest ==> Scrum Master

      //  int longest = 0;
        String lon="";
        String sho="";
        for (int i=0; i < arr2.length; i++){

            if (arr4[i].length() > lon.length()){
                lon = arr4[i];
            }

            if (arr4[i].length() < lon.length()){
                sho = arr4[i];
            }
        }
        System.out.println("Longest is: "+lon);
        System.out.println("Shortest is: "+sho);

        // comparing length of Arrays

        boolean b1 = Arrays.equals(arr3,arr4);
        System.out.println(b1);

        // if any values of two arrays are equal?

        for (int k=0; k < arr3.length; k++) {

            for (int i = 0; i < arr4.length; i++) {

                if (arr4[i].equalsIgnoreCase(arr3[k])) {
                    System.out.print(arr4[i]+" ");
                }
            }
        }
    }
}





