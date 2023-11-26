public class AccountTest{
    public static void main( String args[]){
        Account acct1 = new Account(50.00); 
        Account acct2 = new Account(-7.53); 

       
        System.out.println("acct1 balance: $"+acct1.getBalance()); 
        acct1.debit(55.0);
        System.out.println("acct1 balance: $"+acct1.getBalance()); 
        acct1.debit(45.0);
        System.out.println("acct1 balance: $"+acct1.getBalance());
    }
}