public class Account{
    private double balance;

    public Account(double initBalance){
        if (initBalance >= 0.0)
            balance = initBalance;
        else
            balance = 0.0;
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public void debit(double amount){
        if(amount<=balance) {
            balance = balance - amount;
        }
        else{
            System.out.println("Debit amount exceeded account balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}