package Day39_AccessModifier;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println("Name is: "+ PersonalInfo.name);
        System.out.println("Gender is: "+PersonalInfo.gender);

         System.out.println("Grade is: "+PersonalInfo.grade);
         System.out.println("Age is: "+PersonalInfo.age);

      //  System.out.println("SSN is: "+PersonalInfo.ssn); ERROR coz all these variables are private
      //  System.out.println("ID is: "+PersonalInfo.ID); ERROR coz all these variables are private


        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);
       // OR System.out.println(PersonalInfo.name);
        System.out.println(obj.gender);

        System.out.println(obj.grade);
        System.out.println(obj.age);

      //  System.out.println(obj.ssn);
      //  System.out.println(obj.ID);



    }
}
