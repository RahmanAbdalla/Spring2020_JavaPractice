package Day37_Constructors;
import java.util.*;
/* import static Day37_Constructors.Data.staticVariable;//we MUST import this inorder to use "staticVariable inside M.Method
import static Day37_Constructors.Data.staticMethod; // this is fot using the static Method

 */
import static Day37_Constructors.Data.*; // this brings all static members you have

public class ImportStatement {

    public static void main(String[] args) {

        int [] arr = {4,3,2,1};

        Arrays.sort(arr);

        System.out.println(staticVariable);

        staticMethod();

    }
}
