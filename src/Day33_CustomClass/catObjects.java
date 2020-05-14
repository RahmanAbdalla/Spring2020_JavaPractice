package Day33_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {
    public static void main(String[] args) {


        Cat cat1 = new Cat();
        cat1.catInfo("Siemes","White","Sasha",3);

        Cat cat2 = new Cat();
        cat2.catInfo("Scottish","Beige","Bobo",4);

        ArrayList<Cat> catList = new ArrayList<>(Arrays.asList(cat1,cat2));


        for(int i = 0; i < catList.size(); i++){
            System.out.println(  catList.get(i)  );
        }


        System.out.println("=====================================");
        cat1.sleep();
        cat2.sleep();

        System.out.println("====================================");
        cat1.eat("cat treats");
        cat2.eat("fish");

        System.out.println("=================================");
        cat1.drink("water");
        cat2.drink("milk");



    }
}
