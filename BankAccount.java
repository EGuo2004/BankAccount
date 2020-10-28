public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int Username, String Passcode) {
    this.accountID = Username;
    this.password = Passcode;
  }

  public double getBalance() {
    return this.balance;
  }

  public int getAccountID() {
    return this.accountID;
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

  public boolean withdraw(double amount) {
    if (amount < 0) {
      return false;
    } else {
      if (balance < amount) {
        return false;
      } else {
        balance -= amount;
        return true;
      }
    }
  }

  public String toString(){
    return "#"+accountID + "\t$" + balance;
  }

  private boolean authenticate(String password) {
    return this.password.equals(password);
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if (password == this.password) {
      if (amount > 0) {
        if (amount < balance) {
          withdraw(amount);
          other.deposit(amount);
          return true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    } else {
      return false;
    }
  }


}
