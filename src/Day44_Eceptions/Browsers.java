package Day44_Eceptions;

public class Browsers {

    public void openBrowser(){
        System.out.println("opens the default browser");
    }
    public void closeBrowser(){
        System.out.println("closes the default browser");
    }

}

class ChromeBrowser extends Browsers{

    @Override
    public void openBrowser(){
        System.out.println("opens the chrome browser");
    }

    public void closeBrowser(){
        System.out.println("closes the chrome browser");
    }
}

class FirefoxBrowser extends Browsers{

    public void openBrowser(){
        System.out.println("opens the Firefox browser");
    }

    public void closeBrowser(){
        System.out.println("closes the Firefox browser");
    }
}

class OperaBrowser extends Browsers{

    public void openBrowser(){
        System.out.println("opens the Opera browser");
    }

    public void closeBrowser(){
        System.out.println("closes the Opera browser");
    }
}

class Test{

    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();
        chrome.openBrowser();
        chrome.closeBrowser();

        FirefoxBrowser ff = new FirefoxBrowser();
        ff.openBrowser();
        ff.closeBrowser();

        OperaBrowser opera = new OperaBrowser();
        opera.openBrowser();
        opera.closeBrowser();

    }
}