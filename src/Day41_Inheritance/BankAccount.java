package Day41_Inheritance;

public class BankAccount {

    public static String bankName;
    public String firstName;
    public String lastName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount (String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        accountHolder=firstName+" "+lastName;

    }

    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }


    public void  depositing(double deposit){
        this.balance += deposit;
      //OR  setBalance(deposit + deposit);
    }
    public void withdrawing( double withdraw ){
        if (withdraw <= balance) {
            balance -= withdraw;
            //OR  setBalance(balance - withdraw);
        }else {
            System.out.println("Withdrawing amount is greater than available balance");
        }

    }

    public void availableBalance(){
        System.out.println("Available balance is: "+getBalance());
        //OR    System.out.println("Available balance is: "+balance);
    }

    public String toString(){
        return "Full Name: "+ getAccountHolder()+", Balance: $"+getBalance();
    }

}

class bankAccObject{

    public static void main(String[] args) {

        BankAccount obj = new BankAccount("Rahman","Abdalla");
        System.out.println(obj);

        System.out.println(obj.getAccountHolder());

        obj.setBalance(120);
        obj.availableBalance();
      //OR  System.out.println(obj.getBalance());

        obj.depositing(50);
        obj.availableBalance();
       //OR System.out.println(obj.getBalance());

        obj.withdrawing(170);
        System.out.println(obj.getBalance());

        System.out.println(obj);


    }
}




/*
/*    int[][] arrnew = {WHITE, LIGHT_GRAY, GRAY,DARK_GRAY,BLACK,RED,PINK,ORANGE,YELLOW,GREEN,MAGENTA,CYAN,BLUE};
        String colorNames [] = {"white","light gray","gray","dark gray","black",
                "red","pink","orange","yellow","green","magenta","cyan","blue"};
        String colors="";

        for (int i=0; i < arrnew.length; i++){
            if (Arrays.equals(rgb, arrnew[i])){
                colors = colorNames[i];
            }

 */