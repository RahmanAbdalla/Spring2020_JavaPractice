package Day33_CustomClass;

public class BankAccObject {
    public static void main(String[] args) {

        bankAcoount account1 = new bankAcoount();

       // account1.getAccInfo("Rahman",123455654,45453);
        account1.getAccInfo("Cybertek",12345656,5);
        System.out.println(account1);
        System.out.println("======================");

        account1.checkingBalance();

        account1.withdraw(300);


        account1.checkingBalance();

        account1.depos(500);
    }
}
