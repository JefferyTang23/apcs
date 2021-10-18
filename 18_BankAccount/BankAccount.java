/*
DISCO: 
QCC: 
Team NIWWD's Latest and Greatest Q2 Response: We know that Java provides a default contructor before we wrote our own constructor because 
Team NIWWD's Latest and Greatest Q3 Response:
  BankAccount Account = new BankAccount ("John", 123098765, 140.99);
  System.out.println (Account);
Its output is "BankAccount@5d22bbb7"
*/

public class BankAccount {
  public String holderName;
  private String accountPassword;
  private int pin;
  public int accountNumber;
  private double accBalance;
  
  public BankAccount (String hName,/* String accPass, int fourdPIN,*/ int accNumb, double accBal) {
    holderName = hName;
    //accountPassword = accPass;
    //pin = fourdPIN;
    accountNumber = accNumb;
    accBalance = accBal;
  }

  private void withdraw (double withdrawAmount) {
    accBalance = accBalance - withdrawAmount;
    }
  private void deposit (double depositAmount) {
    accBalance = accBalance + depositAmount;
    }
  private void setHolderName (String name) {
    holderName = name;
    }
  private void setAccountNumber (int accNum) {
    accountNumber = accNum;
    }
  private void setAccountPassword (String accPW) {
    accountPassword = accPW;
    }
  private void setPin (int accPIN) {
    pin = accPIN;
    }
  private void printInfo () {
    System.out.println (holderName);
    System.out.println (accountNumber);
    System.out.println (accBalance);
    }
  public static void main(String[] args) {
    BankAccount Account = new BankAccount ("John", 123098765, 140.99);
    System.out.println (Account);
    }
}
