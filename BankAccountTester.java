public class BankAccountTester{
  public static void main (String[] args){
    BankAccount gAccount = new BankAccount("Gillian", "USAA",
    "Gillian's Checking", 0.0, 10.000);
    BankAccount nAccount = new BankAccount("Nina", "Wells Fargo",
    "Nina's Checking", 0.0, 7.000);

    System.out.println(nAccount + "\n");
    System.out.println(gAccount + "\n");

    //gAccount.transfer(100);
    //System.out.println();
    //System.out.println("Transferred $100 to Nina's Checking " + "\n" + gAccount);

    gAccount.withdrawl(600);
    System.out.println();
    System.out.println("Withdrew $600 " + "\n" + gAccount);

    gAccount.Deposit(400);
    System.out.println();
    System.out.println("Deposited $400 " + "\n" + gAccount);
    System.out.println();

    nAccount.withdrawl(300);
    System.out.println();
    System.out.println("Withdrew $300 " + "\n" + nAccount);

    nAccount.Deposit(400);
    System.out.println();
    System.out.println("Deposited $400 " + "\n" + nAccount);
  }
}
