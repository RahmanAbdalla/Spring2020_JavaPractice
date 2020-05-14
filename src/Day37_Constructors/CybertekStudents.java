package Day37_Constructors;

public class CybertekStudents {


    static String schoolName = "Cybertek University";
    String studentName; // we must need to know
    int groupNumber; // we must need to know
    String batch; // we must need to know

    public CybertekStudents( String studentName, int groupNumber, String batch){
        // schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+
                ", in group: "+groupNumber+", School name: "+schoolName;
    }

}


class CObjects{

    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Drar", 3,"Batch 18");
        student1.schoolName = "MIT";

        System.out.println(student1);

        CybertekStudents student2 = new CybertekStudents("Sarah", 12, "Batch 18");

        System.out.println(student2);

    }

}


