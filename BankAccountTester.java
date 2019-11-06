public class BankAccountTester{
  public static void main (String[] args){
    BankAccount gAccount = new BankAccount("Gillian", "USAA",
    "Gillian's Checking", 510, 0.2);
    BankAccount nAccount = new BankAccount("Nina", "Wells Fargo",
    "Nina's Checking", 612, 0.2);

    System.out.println(nAccount + "\n");
    System.out.println(gAccount);

    //gAccount.transfer(100);
    //System.out.println();
    //System.out.println("Transferred $100 to Nina's Checking " + "\n" + gAccount);


    System.out.println("~ Withdrawing money from account ~");
    gAccount.withdrawl(600);
    System.out.println();
    System.out.println("Withdrew $600 " + "\n" + gAccount);

    System.out.println("~ Depositing money into account ~");
    gAccount.Deposit(400);
    System.out.println();
    System.out.println("Deposited $400 " + "\n" + gAccount);
    System.out.println();

    System.out.println("~ Withdrawing money from account ~");
    nAccount.withdrawl(300);
    System.out.println();
    System.out.println("Withdrew $300 " + "\n" + nAccount);

    System.out.println("~ Depositing money into account ~");
    nAccount.Deposit(400);
    System.out.println();
    System.out.println("Deposited $400 " + "\n" + nAccount);
  }
}
