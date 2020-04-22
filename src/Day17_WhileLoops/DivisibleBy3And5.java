package Day17_WhileLoops;

public class DivisibleBy3And5 {
    public static void main(String[] args) {

        String res="";
        for (int i=1; i<=30; i++){

            if (i%3 ==0 && i%5==0){
                res+="FINRA"+" ";
            }else if (i%3 ==0){
                res+="FIN"+" ";
            }else if (i%5 ==0){
                res+="RA"+" ";
            }else {
                res+=i+" ";
            }
        }
        System.out.println(res);
    }
}
