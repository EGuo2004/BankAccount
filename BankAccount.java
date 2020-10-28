public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int Username, String Passcode) {
    accountID = Username;
    password = Passcode;
  }

  public String getBalance() {
    return ("Current Balance: "+balance);
  }

  public String getAccountID() {
    return ("Account Number: " + accountID);
  }

  public void setPassword(String newPass) {
    this.password = newPass;
  }

  public boolean deposit(double amount) {
    if (amount < 0) {
      return false;
    } else {
      balance += amount;
      return true;
    }
  }
}
