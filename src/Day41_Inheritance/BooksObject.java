package Day41_Inheritance;

public class BooksObject {

    public static void main(String[] args) {

        Ebook ebook1 = new Ebook();

        ebook1.title = "Hamlet";
        ebook1.author="Shakespeare";
        ebook1.price = 20;

        System.out.println(ebook1);
        ebook1.readBook();

        ebook1.size= "1.5 MB";
        ebook1.pages=200;

        System.out.println("Size: "+ ebook1.size+"\nPages: "+ebook1.pages);

        System.out.println("=============== Audio Book ===================");

        AudioBook book1 = new AudioBook();

        book1.title = "Harry Porter";
        book1.price = 15;
        book1.author = "James William";

        book1.length = "3 hours and 30 minutes"; // from audio book object

        System.out.println(book1);

        System.out.println("Length of \""+book1.title+"\" is "+book1.length);

        book1.listen();

    }
}
