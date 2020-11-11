import java.util.Scanner;

class CuentaCorriente2 {
    // Atributos
    private int saldo;
    private int descubierto=-50;
    private String nom;
    private String DNI;
  
  CuentaCorriente2 (int saldo, int descubierto, String nom, String DNI) {
        this.saldo=saldo;
        this.descubierto=descubierto;
        this.nom=nom;
        this.DNI=DNI;
        }
  
     CuentaCorriente2 (int saldo) {
        this.saldo=saldo;
        this.descubierto=0;
        this.nom="desconocido";
        this.DNI="00000000X";
    }
     
     
  CuentaCorriente2 (int saldo, int descubierto, String DNI) {
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
  
class exercici4 {
    public static void main(String[] args) {
      System.out.println("Creación de cuenta, por favor, introduzca su nombre");
      Scanner sc = new Scanner(System.in);
      String nom = sc.nextLine();
      System.out.println("Introduzca su DNI");
      String DNI = sc.nextLine();
      CuentaCorriente2 cuenta1 = new CuentaCorriente2(0,1,nom,DNI);
      CuentaCorriente2 cuenta2 = new CuentaCorriente2(3000);
      CuentaCorriente2 cuenta3 = new CuentaCorriente2(2000,-100,"546787Q");
      cuenta2.informacion();
      cuenta3.informacion();
      cuenta1.crearcuenta();
      cuenta1.depositardinero();
      cuenta1.retirardinero ();
      cuenta1.informacion ();
      sc.close();
    }
  
  }