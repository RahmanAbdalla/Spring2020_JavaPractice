package Day54_Maps;

public class String_VS_Buffer_VS_Builder {
    public static void main(String[] args) {

        String str1 = "Cybertek";
             str1.concat(" School");

        System.out.println(str1); //Cybertek : coz String is immutable

        System.out.println("============ StringBuilder ================");

        // we can only use "new" keyword for making StringBuilder and StringBuffer

        StringBuilder builder = new StringBuilder("Cybertek");
                      builder.append(" School");
        System.out.println(builder); // Cybertek School coz StringBuilder is mutable

        System.out.println("============= StringBuffer =============");

        StringBuffer buffer = new StringBuffer("Cybertek");
                     buffer.append(" School");
        System.out.println(buffer);


        System.out.println("=================== Reversing String ========================");
        // Coz

        String word = "ABCD";

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        System.out.println(sb);


    }
}
