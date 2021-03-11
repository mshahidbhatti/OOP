class BankAccount{

  private int accountID;
  private String accountTitle;
  private double openingBalance=500;
  private double accountBalance;
  private String email;
  private static int counter=0;

  BankAccount(String accountTitle, double openingBalance, String email){
    counter++;
    this.accountID=counter;
    this.accountTitle=accountTitle;
    if(openingBalance>=this.openingBalance)
      this.accountBalance=openingBalance;
    this.email=email;
  }
  BankAccount(String accountTitle, double openingBalance){
    this(accountTitle,openingBalance,"No Email");
  }


public boolean deposit(double depositAmount){
  if(depositAmount>0){
      accountBalance+=depositAmount;
      return true;

    }
    else
    return false;

}

public String toString(){
  return String.format("%04d %-14s %.2f %-15s",this.accountID,this.accountTitle,this.accountBalance,this.email);
}





}
