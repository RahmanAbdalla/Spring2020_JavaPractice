package Day46_final_abstract;

public class credentials {

    final private String username = "Cybertek";
    final private String password= "CyberTek12345";

    public String getUsername(){
        return username;
    }

   /* public void setUsername(String username){
        this.username = username;
    }
    */
   public String getPassword(){
       return password;
   }

  /* public void setPassword(String password){
       this.password = password;
   } */

}


class Test1 {

    public static void main(String[] args) {

        credentials obj = new credentials();

        System.out.println(obj.getPassword());
        System.out.println(obj.getUsername());

    }
}
