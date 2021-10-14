
public class BankAccount {
  public String holderName;
  private String accountPassword;
  private int pin;
  public int accountNumber;
  private double accBalance;
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
}
