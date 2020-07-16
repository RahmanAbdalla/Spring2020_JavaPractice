package Day54_Maps;

public class Test {
    public static void main(String[] args) {

        // We can only assign either Red, Blue, or Green coz enum is used to store fixed number of dataType
        Color myFavoriteColor1 = Color.Red;

       // Color myFavoriteColor = Color.Yellow; coz we haven't assigned it before in the enum class

        Color myFavoriteColor2 = Color.Blue;

        Color myFavoriteColor3 = Color.Green;
        System.out.println(myFavoriteColor1); // Red

        /// Testing Browsers enum
        
        Browsers browser1 = Browsers.Chrome;

        System.out.println(browser1); // Chrome

    }
}
