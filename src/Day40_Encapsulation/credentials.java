package Day40_Encapsulation;

public class credentials {

    private String userName;
    private String password;


    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setPassword(String password){
        this.password=password;
    }

}

class credentialsObject{

    public static void main(String[] args) {

        credentials person1 = new credentials();

        person1.setUserName("Muhtar");
        person1.setPassword("cybertekSchool2020");

        System.out.println("Username is: "+person1.getUserName()+", Password is: "+person1.getPassword());

    }
}
