

public class BankAccountDemo{

public static void main(String args[]){

  BankAccount account1 = new BankAccount("Fatima",1000,"fatima@gmail.com");


  //System.out.println(account1.toString());


  BankAccount account2 = new BankAccount("Daniyal",1000);


  //System.out.println(account2.toString());

  BankAccount account3 = new BankAccount("Amasil",1000,"amasil@gmail.com");
  BankAccount account4 = new BankAccount("Ahmed",2000,"ahmed@gmail.com");
  BankAccount account5 = new BankAccount("Nimra",2000);

  if(account4.deposit(-100))
    System.out.println("Transaction succesfull");
  else
    System.out.println("Invalid Transaction amount");


  System.out.println(account1.toString());
  System.out.println(account2.toString());
  System.out.println(account3.toString());
  System.out.println(account4.toString());
  System.out.println(account5.toString());


}
}
