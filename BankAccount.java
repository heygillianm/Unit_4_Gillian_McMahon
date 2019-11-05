public class BankAccount{
  //attributes of a bank account (instance variables)
  private double balance;
  private double interest;
  private String accountName;
  private String owners;
  private String bankName;

  //constructor for BankAccount class.Initializes instance variables
  public BankAccount (String accOwners, String accBank, String accName,
  double accBalance, double accInterest){
    balance = accBalance;
    accountName = accName;
    owners = accOwners;
    bankName = accBank;
    interest = accInterest;
  }
  //getter methods for instance variables
  public String getAccName(){
    return accountName;
  }
  public String getOwners(){
    return owners;
  }
  public String getBank(){
    return bankName;
  }
  public double getInterest(){
    return interest;
  }
  public double getBalance(){
    return balance;
  }

  //setter methods for instance variables
  public double setBalance(double theBalance){
      balance= theBalance;
  }
  //methods for what a bank account does

  //lets client transfer money to another bank account
  //public void transfer(double ammTransfer){
  //setBalance();


  //lets client withdrawl money
  public void withdrawl(double subWithdrawl){
    setBalance(getBalance() - subWithdrawl);

  }

  // lets client deposit money
  public void Deposit(double addDeposit){
    setBalance(getBalance() + addDeposit);
  }

  //prints current state of bank account
  public String toString(){
  String result = "Account balance:" + balance;
  result += "    Account Owners: " + owners + ", Bank Name: " + bankName;
  result += "    Account Name: " + accountName;
  //result += "    Transfers: " + transfer +
  result += "    Deposits: " + deposit;
  result += "    Withrawls: " + ammountWithdrawl;

  }

}
