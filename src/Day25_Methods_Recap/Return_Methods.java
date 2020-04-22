package Day25_Methods_Recap;

public class Return_Methods {
    public static void main(String[] args) {

        System.out.println(max1(5,7));
        System.out.println(max2(5,7));

    }

    public static int max1 (int a, int b){

        int max=0;
        if (a > b){
            max=b;
        }else {
            max=b;
        }
        return max;
    }

    public static int max2 (int a, int b){//this way is shorter than the one in line 11
        if (a >= b){
            return a;
        }
        return b;
    }
}
