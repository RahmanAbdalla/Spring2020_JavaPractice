package Day17_WhileLoops;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {

        int sum=0;
        int num=1;
        while (num <= 10){
            sum+=num;
            num+=2;
        }
        System.out.println("The sum of even numbers is: "+sum);
    }
}
