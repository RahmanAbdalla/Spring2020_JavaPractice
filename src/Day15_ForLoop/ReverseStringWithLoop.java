package Day15_ForLoop;

public class ReverseStringWithLoop {
    public static void main(String[] args) {

        String java = "Java";
                    // 0123
        String reverse1 = ""+java.charAt(3)+java.charAt(2)+java.charAt(1)+java.charAt(0);

        int lastIndex = java.length()-1; //it's better to get the str length coz if the str
                                       //changes we don't need to change it each time

        for (int i =lastIndex; i>=0; i--){
        /*for (int i =3; i>=0; i--)//it's better to get the str length coz if the str
                                   changes we don't need to change it each time */
            System.out.print(java.charAt(i));
        }

    }
}
