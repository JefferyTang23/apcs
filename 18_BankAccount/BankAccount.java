/*
DISCO: 
QCC: 
Team NIWWD's Latest and Greatest Q2 Response: 
Team NIWWD's Latest and Greatest Q3 Response: 
*/

public class BankAccount {
  public static String holderName;
  private static String accountPassword;
  private static int pin;
  public static int accountNumber;
  private static double accBalance;

  private static void withdraw (double withdrawAmount) {
    accBalance = accBalance - withdrawAmount;
    }
  private static void deposit (double depositAmount) {
    accBalance = accBalance + depositAmount;
    }
  private static void setHolderName (String name) {
    holderName = name;
    }
  private static void setAccountNumber (int accNum) {
    accountNumber = accNum;
    }
  private static void setAccountPassword (String accPW) {
    accountPassword = accPW;
    }
  private static void setPin (int accPIN) {
    pin = accPIN;
    }
  private static void printInfo () {
    System.out.println (holderName);
    System.out.println (accountNumber);
    System.out.println (accBalance);
    }
  public static void main(String[] args) {
    deposit (300.0);
    withdraw (50.0);
    setHolderName ("student");
    setAccountNumber (123456789);
    setAccountPassword ("PlzHackMe123");
    setPin (0123);
    printInfo ();
    }
}
