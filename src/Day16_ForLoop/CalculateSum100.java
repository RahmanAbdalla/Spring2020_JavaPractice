package Day16_ForLoop;

public class CalculateSum100 {
    public static void main(String[] args) {

        int evenSum=0;
        for (int n=2; n<=100; n+=2){
            evenSum+=n;
        }
        System.out.println(evenSum);


           // OR we can do it this way

        int Sum1=0;
        int Sum2=0;

        for (int n=0; n<=100; n++) {
            if (n % 2 == 0) {
                Sum1 += n;
            }else {
                Sum2+=n;
            }
        }
        System.out.println(Sum1);
        System.out.println(Sum2);



    }
}
