package Day37_Constructors;

public class studentObject {

    public static void main(String[] args) {

// if we use constructor then we don't need to use call set method every time. like in line 10;
        students stu1 = new students("Rahman",30,'M',"CybertekSchool");

      //  stu1.setInfo("Rahman",30,'M',"CybertekSchool");
        System.out.println(stu1);

        students stu2 = new students("Adil",34,'M',"Cambridge");
        System.out.println(stu2);
    }
}
