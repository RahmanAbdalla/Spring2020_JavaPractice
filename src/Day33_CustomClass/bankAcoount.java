package Day33_CustomClass;

public class bankAcoount {

    /*
    practice task:
    create a custom class for bank account
      attrubutes: accountholder, accountnumber, balance
      actions: cehckingBalance(), withDraw( amount ), deposit( amount )
     */
    String name;
    long number;
    double balance;


    public void checkingBalance() {
        System.out.println("Available balance is: "+balance);
    }
    public void depos (double depAmount){
        System.out.println("Balance after depositing "+depAmount+" is: "+ (balance += depAmount));
    }
    public void withdraw (double amount){
        if (balance <= 0){
            System.out.println("Sorry, you are not able to withdraw any money, for your available balance is: "+balance);
        }else if (amount > balance){
            balance -= (amount + 35);
            System.out.println("Your balance is now: "+balance+" including $35 charging fee");

        }else {
            System.out.println("Balance after withdrawing " + amount + " is: " + (balance -= amount));
        }
    }


    public void getAccInfo( String accHoldername, long accNum, double accBalance){
        name = accHoldername;
        number = accNum;
        balance = accBalance;

    }

    public String toString(){
        String result = "Account holder is: "+name+"\nAccount number is: "+number+"\nAvailable balance is: "+balance;
        return result;
    }

/*
create a custom class for BankAccount
	attributes/data that can have are:
					1. AccountHolder, 2. AccountNumber, 3. Balance
		Actions: showBalance, deposit, withdraw
		requiremnts:
			1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
			3. user should be able to see their balance
 */
}
