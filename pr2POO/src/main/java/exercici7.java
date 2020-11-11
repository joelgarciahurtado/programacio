import java.util.Scanner;

class CuentaCorriente5 {
    // Atributos
    private int saldo;
    private int descubierto=-50;
    private String nom;
    private String DNI;
    private String banco;
  
  CuentaCorriente5 (int saldo, int descubierto, String nom, String DNI, String banco) {
        this.saldo=saldo;
        this.descubierto=descubierto;
        this.nom=nom;
        this.DNI=DNI;
        this.banco=banco;
        }
  
     CuentaCorriente5 (int saldo) {
        this.saldo=saldo;
        this.descubierto=0;
        this.nom="desconocido";
        this.DNI="00000000X";
    }
     
     
  CuentaCorriente5 (int saldo, int descubierto, String DNI) {
        this.saldo=saldo;
        this.descubierto=descubierto;
        this.DNI=DNI;
        this.nom="desconocido";
        }

    public void crearcuenta() {
        int saldo = 0;

    }

  
      // Métodos
     public void depositardinero() {
        saldo++;
        System.out.println("Dinero depositado en la cuenta, saldo actual:  " + this.saldo);
  
      }
  
     public void modificarbanco(String banco) {
         this.banco=banco;
     }
     
     
      public void retirardinero() {
        saldo--;
        System.out.println("Dinero extraido de la cuenta, saldo actual: " + this.saldo);
      }
  
      public void informacion() {
        System.out.println("Nombre del propietario " + this.nom);
        System.out.println("DNI del propietario " + this.DNI);
        System.out.println("Dinero actual " + this.saldo);
      }
  
    
  }
  
class exercici7 {
    public static void main(String[] args) {
      System.out.println("Creación de cuenta, por favor, introduzca su nombre");
      Scanner sc = new Scanner(System.in);
      String nom = sc.nextLine();
      System.out.println("Introduzca su DNI");
      String DNI = sc.nextLine();
      CuentaCorriente5 cuenta1 = new CuentaCorriente5(0,1,nom,DNI,"BBVA");
      CuentaCorriente5 cuenta2 = new CuentaCorriente5(3000);
      CuentaCorriente5 cuenta3 = new CuentaCorriente5(2000,-100,"546787Q");
      cuenta2.informacion();
      cuenta3.informacion();
      cuenta1.crearcuenta();
      cuenta1.depositardinero();
      cuenta1.retirardinero ();
      cuenta1.informacion ();
      cuenta1.modificarbanco("La caixa");
      cuenta2.modificarbanco("La caixa");
      cuenta3.modificarbanco("La caixa");
      sc.close();
    }
  
  }