/**
   NIWWD: Kevin Xiao + Mr. Swag, Jeffery Tang + Mathias, Kaitlin Ho + Apple 
   APCS
   HW19 -- Better BankAccount in Java
   2021-10-19
**/

/**
   DISCO: 
   QCC: 
**/

public class BankAccount {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    if (1000 <= newPin && newPin <= 9998) {
      short oldPin = pin;
      pin = newPin;
      return oldPin;
    }
    else {
       accNum = 9999;
       System.out.println ("The entered Account PIN is not a 4 digit number; please enter a 4 digit number");
    }
  }

  public int setAcctNum( int newAcctNum ) {
    if (100000000 <= newAcctNum && newAcctNum <= 999999998) {
      int oldAcctNum = acctNum;
      acctNum = newAcctNum;
      return oldAcctNum;
    }
    else {
       accNum = 999999999;
       System.out.println ("The entered Account Number is not a 9 digit number; please enter a 9 digit number");
    }
  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public void withdraw( double withdrawAmount ) {
    if ( withdrawAmount <= balance ) {
      balance = balance - withdrawAmount;
      return true;
    }
    else {
      System.out.println("Account balance is less than the requested withdrawal amount; please enter an amount equal to or less than the account balance")
      return false;
    }
  }
  
  public boolean authenticate(int an, String pw) {
     if (an == acctNum && pw = passwd) {
        return true;
     }
     else {
        return false;
     }
  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }

  //main method for testing
  public static void main( String[] args ) {
    BankAccount ba = new BankAccount();
    ba.setName("John");
    ba.setPasswd("hellotheremyfriends");
    ba.setPin((short) 2131);
    ba.setAcctNum(123456789);
    ba.setBalance(1000.00);
    ba.deposit(500.0);
    ba.withdraw(241.0);
    System.out.println(ba.toString());
  }

}
