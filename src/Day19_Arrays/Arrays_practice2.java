package Day19_Arrays;

public class Arrays_practice2 {
    public static void main(String[] args) {


        int[] arr = {10, 20, 30};

        System.out.println(arr.length);// first way

        int length = arr.length; // Second way
        System.out.println(length);

        int [] arr2 = new int[5];// if we don't give data here then we only get 0 when we call the index

        System.out.println(arr2[0]);// 0
        System.out.println(arr2[2]);// 0
        arr2[2] = 10; // now arr[2]=10

        System.out.println(arr2[2]);//10


        String [] testers = new String[3]; // we want to add these names; {"Reem","Rahman","Ali"}

        testers[1]="Rahman";
        testers[2]="Ali";       // testers[0] print "null"
        System.out.println("Testers are: "+testers[0]+", "+testers[1]+", and "+testers[2]);

        System.out.println(testers.length);// still 3

        System.out.println("=====================================");
    }
}
