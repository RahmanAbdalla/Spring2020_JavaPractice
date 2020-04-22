package Day10_Switch_Scanner;

public class SwitchStatement_Practice2 {
    public static void main(String[] args) {
        int num = 2; // 2, 12, 7

        switch (num){
            case 1:
                num +=3;
                break;
            case 2: // compiler starts from this one coz switch block is (2)
                num +=2; // num = 0 + 2 = 2

            case 3:
                num += 10;// 2 + 10 = 12

            default:
                num -= 5; // 12 - 5 = 7
        }
        System.out.println(num);


    }
}
