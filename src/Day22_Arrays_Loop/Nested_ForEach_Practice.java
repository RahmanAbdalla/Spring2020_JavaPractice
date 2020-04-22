package Day22_Arrays_Loop;

public class Nested_ForEach_Practice {
    public static void main(String[] args) {

      int [][] numbers = { {1,2,3}, {4,5,6,7,8,9}, {10,11,12,13,14}, {15,16,17,18,19,20,21}};

      int count =0;
      int sumOdd=0;
      int sumEven=0;
      for (int [] each1D : numbers){

          for (int eachnum : each1D){

              if (eachnum % 2 == 0){
                  sumEven+=eachnum;
                  System.out.print(eachnum+" ");
              }else {
                  count++;
                  sumOdd+=eachnum;
              }
          }
      }
        System.out.println();
        System.out.println("Sum of even is: "+sumEven);
        System.out.println("Sum of odd is: "+sumOdd);
        System.out.println("count is: "+count);
    }
}
