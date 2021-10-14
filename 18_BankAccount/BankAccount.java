
public class BankAccount {
  public static String holderName;
  private static String accountPassword;
  private static int pin;
  public static int accountNumber;
  private static double accBalance;
  private static void withdraw (double withdrawAmount) {
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
    deposit (100.0);
    withdraw (50.0);
    setHolderName ("student");
    setAccountNumber (123456789);
    setAccountPassword ("PlzHackMe123");
    setPin (0123);
    printInfo ();
    }
}
