package Day08_IfStatements;

public class MultiBranchIf_Practice {
    public static void main(String[] args) {

        double score = 45;
        boolean AGrade = score >=90 && score <=100;
        boolean BGrade = score >= 80 && score >90;
        boolean CGrade = score >=70 && score <80;
        boolean DGrade = score >=60 && score >70;
        boolean FGrade = !AGrade && !BGrade && !CGrade && !DGrade;

       String grade1 = ""; /*to prevent compile error initialize the variable (grade1)
                            for exp: now we have used (" ") to initialized (grade1)*/
        // We can also use this: char grade = ' '; But we have to give a space bet. the single commas.

        if (AGrade){
            grade1 = "A";
       }
        else if (BGrade){
            grade1 = "B";
        }
        else if (CGrade){
            grade1 = "C";
        }
        else if (DGrade){
            grade1 = "D";
        }
        else {
            grade1 = "F";
        }

        System.out.println("Score "+score+" is: "+grade1);

    }

}
