package JavaInterviewQuestions;



import java.util.*;

public class MovingZeros {
    public static void main(String[] args) {

/*
        int a[] = {1, 0, 2, 0, 3, 0, 4, 0,5,6,0,0};

        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
            if (a[i] != 0) {
                list.add(a[i]);
            }
        }

        for (int i = 0; i < count; i++) {
            list.add(0);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        System.out.println(Arrays.toString(a));


        int c = 13;
        int k = 20;

        int cc = k; //20
        int kk = c; //13
        c = cc; //c= 20
        k = kk; // k=13
        System.out.println("c is: " + c);
        System.out.println("k is: " + k);


        int n=4;
        int res=1;
        for (int i=0; i < n; i++) {
            res+=n*(n-1);
        }
        System.out.println(res);

 */

        String str = "anndggddefrths";

        String  res = freq(str);
        System.out.println(res);


    }
    //                  String str = "DevLabs Alliance is awesome.";

    public static String freq( String str) {

        String res="";

        for (int i=0; i < str.length(); i++) {

            int count=0;
            for (int k=0; k < str.length(); k++) {
                if (str.charAt(k)==str.charAt(i)){
                    count++;
                }

            }
            if (count > 1)
                res += str.charAt(i);

        }

            return res;

    }
}

