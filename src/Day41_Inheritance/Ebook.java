package Day41_Inheritance;

public class Ebook extends Book {

    /*
    title (inherited)
    author (inherited)
    price(inherited)


     */
    public String size;
    public int pages;


    public void readBook(){
        System.out.println("Reading \""+title+"\"...");
    }



    //we don't need to create a toString() method here coz we already have it in supper inheritant class
}
