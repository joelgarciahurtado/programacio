
import java.util.Scanner;

class CuentaCorriente6 {

    // Atributos
    private int saldo;
    private int descubierto = -50;
    private String nom;
    private String DNI;
    private Banco banco;
    private String banconull;

    CuentaCorriente6(int saldo, int descubierto, String nom, String DNI, Banco banco) {
        this.saldo = saldo;
        this.descubierto = descubierto;
        this.nom = nom;
        this.DNI = DNI;
        this.banco = banco;
    }

    CuentaCorriente6(int saldo, int descubierto, String nom, String DNI) {
        this.saldo = saldo;
        this.descubierto = descubierto;
        this.nom = nom;
        this.DNI = DNI;
        this.banconull = "";
    }

    CuentaCorriente6(int saldo) {
        this.saldo = saldo;
        this.descubierto = 0;
        this.nom = "desconocido";
        this.DNI = "00000000X";
    }

    CuentaCorriente6(int saldo, int descubierto, String DNI) {
        this.saldo = saldo;
        this.descubierto = descubierto;
        this.DNI = DNI;
        this.nom = "desconocido";
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

class Banco {

    private final String NOM;
    private double capital;
    private String direccion;

    Banco(String nom, double capital, String direccion) {
        this.NOM = nom;
        this.capital = capital;
        this.direccion = direccion;
    }

    public Banco(String nom, String direccion) {
        this(nom, 5200000, direccion);
    }

//metode
    public void setCapital(double setcapital) {
        capital = setcapital;

    }

    public void setDireccion(String setdireccion) {
        direccion = setdireccion;
    }

    public void getdatos() {
        System.out.println("Nombre del propietario " + this.NOM);
        System.out.println("DNI del propietario " + this.direccion);

    }

}

class exercici8 {

    public static void main(String[] args) {
        System.out.println("Creación de cuenta, por favor, introduzca su nombre");
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();
        System.out.println("Introduzca su DNI");
        String DNI = sc.nextLine();
        CuentaCorriente6 cuenta1 = new CuentaCorriente6(0, 1, nom, DNI);
        CuentaCorriente6 cuenta2 = new CuentaCorriente6(3000);
        CuentaCorriente6 cuenta3 = new CuentaCorriente6(2000, -100, "546787Q");
        cuenta2.informacion();
        cuenta3.informacion();
        cuenta1.crearcuenta();
        cuenta1.depositardinero();
        cuenta1.retirardinero();
        cuenta1.informacion();
        sc.close();
    }

}
