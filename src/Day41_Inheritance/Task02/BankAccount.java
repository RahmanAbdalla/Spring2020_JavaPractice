package Day41_Inheritance.Task02;

public class BankAccount {
/*
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString
 */
    public long accountNumber;
    public String accountHolder;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

   public void deposit (int deposit){
        balance += deposit;
   }

    public void showBalance() {
        System.out.println("Available balance is: $" + balance);
    }

    public String toString() {
        return "Account Holder: " + accountHolder + ", Balance: $" + balance;
    }

}




class SavingAccount extends BankAccount {
    /*
    variables: accountNumber, accountHolder, balance, interestRate
			methods: deposit, showBalance
     */

   public static double interestRate = 0.02;


}



class checkingAccount extends BankAccount{

    /*
    variables:
    accountNumber (inherited)
    accountHolder (inherited)
    balance (inherited)
			methods: deposit (inherited), withDraw (NOT), showBalance (inherited)
     */

    public void withdraw(double withdraw) {
       balance -= withdraw; // we don't need to return anything that's why we make it void. Though we can do it
    }


}


class BankAccObject{


    public static void main(String[] args) {

        SavingAccount acc1 = new SavingAccount();
        acc1.setInfo("Rahman",124566,200);
        System.out.println(acc1);

        acc1.deposit(100);
        System.out.println(acc1);
        acc1.showBalance();


        checkingAccount check1 = new checkingAccount();
        check1.setInfo("Barzy",57676,500);
        System.out.println(check1);

        check1.deposit(50);
        System.out.println(check1);
        check1.withdraw(30);
        System.out.println(check1);

        check1.showBalance();

    }
}
