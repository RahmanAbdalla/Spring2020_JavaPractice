package Day15_ForLoop;

public class Reverse {
    public static void main(String[] args) {


        String java = "Java";
                    // 0123
        String reverse1 = ""+java.charAt(3)+java.charAt(2)+java.charAt(1)+java.charAt(0);
        System.out.println(reverse1);

        String reverse2 = java.substring(3)+java.substring(2,3)+java.substring(1,2)+java.substring(0,1);
        System.out.println(reverse2);



    }
}
