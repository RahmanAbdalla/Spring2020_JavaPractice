package Day18_nestedLoops;

public class Rverse {
    public static void main(String[] args) {

        //     while
        String st1= "Java";

        int lastIndex1=st1.length()-1;
        String res1="";


        while (lastIndex1 >=0){

            res1+=st1.charAt(lastIndex1);

            lastIndex1--;
            }
        System.out.println(res1);
        System.out.println("=================");


//             do-while


        String st2= "Cybertek";

        int lastIndex2=st2.length()-1;
        String res2="";

        do {
            res2+=st2.charAt(lastIndex2); //a
            lastIndex2--;

        }while (lastIndex2 >=0);
        System.out.println(res2);
        System.out.println("*****************");

        }

}
