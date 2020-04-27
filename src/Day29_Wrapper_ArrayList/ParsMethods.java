package Day29_Wrapper_ArrayList;

public class ParsMethods {
    public static void main(String[] args) {

        String str = "123";// Parsing converts string int to Integer class

        int a1 = Integer.parseInt(str);// 123

        // we can add a number to them to know if it's string or a number
        System.out.println(str+1);
                        // 123 +1 ==> 1231  concatination coz str is a string NOT an int
        System.out.println(a1+1);
                        // 123 +1 ==> 124 coz a1 is an int

        byte b1 = Byte.parseByte(str);
        System.out.println(b1+3);

        Integer I1 = (int) Byte.parseByte(str); // AutoBoxing coz we assign int to Integer Wrapper class
                // we need to cast it to int coz Integer Only takes int


    }
}
