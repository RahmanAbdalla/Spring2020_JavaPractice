package Day03_VariablesContinue;

public class char_boolean {
    public static void main(String[] args) {

        System.out.println('z' == 100); // false. Here we can compare 'z' to a number coz 'z' is not letter but a char character//

        System.out.println('z' == 122);// true

        System.out.println('a' == 'A'); // false

        System.out.println('a' > 'b'); //false coz: 97 > 98

        System.out.println('a' != 98-1); //false coz: 97 == 97

        // System.out.println('a' == "a"); This is wrong coz we cant compare number to text

        boolean r1 = 'a' > 50; // true

        boolean r2 = 'b' == 'a' +1; // true
        System.out.println(r1);
        System.out.println(r2);
    }
}
