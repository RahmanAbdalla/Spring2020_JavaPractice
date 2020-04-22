package Day16_ForLoop;

public class Continue_Practice {
    public static void main(String[] args) {
       // d j y

        for (char ch='z'; ch>='a'; ch--){
            if (ch=='y' || ch=='j' || ch=='d' || ch=='h'){
                continue;
            }

            System.out.print(ch+" ");
        }
        System.out.println();


        for (int i=0; i<=100; i++){
            if (i%3==0 || i%5==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
