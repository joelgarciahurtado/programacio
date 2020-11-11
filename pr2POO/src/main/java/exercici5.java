import java.util.Scanner;

class CuentaCorriente3 {
    // Atributos
    private int saldo;
    private int descubierto=-50;
    private String nom;
    private String DNI;
  
  CuentaCorriente3 (int saldo, int descubierto, String nom, String DNI) {
        this.saldo=saldo;
        this.descubierto=descubierto;
        this.nom=nom;
        this.DNI=DNI;
        }
  
     CuentaCorriente3 (int saldo) {
        this(saldo,0,"desconocido","00000X");
    }
     
     
  CuentaCorriente3 (int saldo, int descubierto, String DNI) {
        this(saldo,descubierto,DNI,"desconocido");
        }

    public void crearcuenta() {
        int saldo = 0;

    }

  
      // Métodos
     public void depositardinero() {
        saldo++;
        System.out.println("Dinero depositado en la cuenta, saldo actual:  " + this.saldo);
  
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
  
class exercici5 {
    public static void main(String[] args) {
      System.out.println("Creación de cuenta, por favor, introduzca su nombre");
      Scanner sc = new Scanner(System.in);
      String nom = sc.nextLine();
      System.out.println("Introduzca su DNI");
      String DNI = sc.nextLine();
      CuentaCorriente3 cuenta1 = new CuentaCorriente3(0,1,nom,DNI);
      CuentaCorriente3 cuenta2 = new CuentaCorriente3(3000);
      CuentaCorriente3 cuenta3 = new CuentaCorriente3(2000,-100,"546787Q");
      cuenta2.informacion();
      cuenta3.informacion();
      cuenta1.crearcuenta();
      cuenta1.depositardinero();
      cuenta1.retirardinero ();
      cuenta1.informacion ();
      sc.close();
    }
  
  }