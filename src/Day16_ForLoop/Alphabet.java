package Day16_ForLoop;

public class Alphabet {
    public static void main(String[] args) {


        String upperCase = "";
        String lowerCase = "";

        for (char ch='A'; ch <='Z'; ch++){
            upperCase += ch;

        }
        System.out.println(upperCase);
        for (char ch='a'; ch<='z'; ch++){
            lowerCase+=ch;
        }
        System.out.println(lowerCase);

        String result="";
        for (int i=0; i<=upperCase.length()-1; i++){
            result+=upperCase.charAt(i)+""+lowerCase.charAt(i)+" ";

        }
        System.out.println(result);



        //second solution
        int a = 97;
        int A = 65;

        String result2 ="";
        for(int i =0 ; i < 26; i++ ){
            char ch = (char)(A +i);  // upper case characters
            //          65
            char ch2 = (char)(a +i);
            //                97+0

            result2 += ch + "" +ch2+" ";
        }

       System.out.println(result2);




            // Third Solution

        // a = 97  ==> z= 122

        for(int i =97 ; i <= 122; i++ ){ // lowercase Alphabet
            char ch1= (char)+i;
            System.out.print(ch1+" ");
        }

        System.out.println();

        // A = 65  ==> Z= 90
        for(int i =65 ; i <= 90; i++ ) {// uppercase
            char ch2 = (char) +i;
            System.out.print(ch2+" ");
        }


        }
}

