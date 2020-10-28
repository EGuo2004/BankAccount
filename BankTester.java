public class BankTester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(0045651,"APCS");

    System.out.println(b1.getBalance());
    System.out.println(b1.getAccountID());
    System.out.println(b1.deposit(-10));
    System.out.println(b1.deposit(500));
    System.out.println(b1.getBalance());
    System.out.println(b1.withdraw(-10));
    System.out.println(b1.withdraw(600));
    System.out.println(b1.withdraw(200));
    System.out.println(b1.getBalance());
    System.out.println(b1.toString());
  }
}
