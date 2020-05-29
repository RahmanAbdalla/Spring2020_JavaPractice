package Day44_Eceptions;

public class task {


    public static void wait(double second){
        try {
            Thread.sleep((long) second * 1000);

        }catch (Exception e){

        }


    }

    public static void main(String[] args) {

        System.out.println("java");
        wait(3.5);
        System.out.println("Hi");

    }
}
