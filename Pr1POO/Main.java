class Bancaria {
  // Atributos
  int balance;


  Bancaria (int balance) {
    this.balance=balance;
  }

    // Métodos
    void depositardinero() {
      balance++;
      System.out.println("Dinero depositado en la cuenta, balance actual:  " + balance);

    }

    public void retirardinero() {
      balance--;
      System.out.println("Dinero extraido de la cuenta, balance actual: " + balance);
    }

    public void balanceactual() {
      System.out.println("Dinero actual " + balance);
    }

  
}

public class Main {
  public static void main(String[] args) {
    Bancaria bancaria1 = new Bancaria(50000);
    bancaria1.depositardinero();
    bancaria1.retirardinero ();
    bancaria1.balanceactual ();

  }

}
