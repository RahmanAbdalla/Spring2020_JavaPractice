package Day47_Abstraction;

/*
Task03:
		1. create an abstract class called Browser
					attributes: browserName
					methods:
							abstract methods: get(URL), close(), maximize();
		2. create three sub classes of Browser:
								1. ChromeBrowser
								2. FireFoxBrowser
								3. OperaBrowser
						each class MUST have constructors to initialize the attributes
					each actions should ONLY be applicable to the object it's called from
					Ex:
						chrome.get("https://www.google.com")
						output should be: chrome browse is opening https://www.google.com
									(it should not open the URL in different browser other than chrome)
 */
public abstract class Browsers {

    public String browserName;


    abstract void getURL(String url);

    abstract void close();

    abstract void maximize();


    public String toString(){
        return "Browser name is: "+browserName;
    }
}

//// ChromeBrowser
final class ChromeBrowser extends Browsers{ // we can make it final so it is not extended by other classes.


    public ChromeBrowser(String browserName){
        this.browserName = browserName;
    }

    @Override
    public void getURL(String url) {
        System.out.println(browserName+" browser is opening "+ url);
    }

    @Override
    public void close() {
        System.out.println(browserName+" is closed");
    }

    @Override
    public void maximize() {
        System.out.println(browserName+" is maximized");
    }
}


final class FirefoxBrowser extends Browsers {

    public FirefoxBrowser(String browserName) {
        this.browserName = browserName;
    }

    @Override
    public void getURL(String url) {
        System.out.println(browserName+" browser is opening "+ url);
    }

    @Override
    public void close() {
        System.out.println(browserName+" is closed");
    }

    @Override
    public void maximize() {
        System.out.println(browserName+" is maximized");
    }
}


final class OperaBrowser extends Browsers {

    public OperaBrowser(String browserName) {
        this.browserName = browserName;
    }

    @Override
    public void getURL(String url) {
        System.out.println(browserName+" browser is opening "+ url);
    }

    @Override
    public void close() {
        System.out.println(browserName+" is closed");
    }

    @Override
    public void maximize() {
        System.out.println(browserName+" is maximized");
    }
}


class browserObjects {

    public static void main(String[] args) {

        ChromeBrowser obj1 = new ChromeBrowser("Chrome");
        obj1.getURL("https://www.google.com");// if we had made ChromeBrowser abstract then we wouldn't be able to call
                                            // get method through object. Coz abstract doesn't accept obj
        obj1.close();
        obj1.maximize();


        FirefoxBrowser obj2 = new FirefoxBrowser("Firefox");
        obj2.getURL("https://www.google.com");


        OperaBrowser obj3 = new OperaBrowser("Opera");
        obj3.getURL("https://www.google.com");


    }
}