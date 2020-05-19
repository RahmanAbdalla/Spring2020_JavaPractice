package Day41_Inheritance;

public class AudioBook extends Book{

      /*
    title (inherited)
    author (inherited)
    price(inherited)
    toString() (in inherited)


    length (to be declared here)
    listen (to be declared here)

     */

      public String length;

      public void listen (){
          System.out.println("listening to \""+title+"\"...");
      }


}
