import java.util.Scanner;

public class PrimeroApp2
{
    public static void main(String[] args) {
  
        System.out.println ("Introdueix un missatge per teclat:");

        String entradateclat = "";

        Scanner entradascanner = new Scanner (System.in);

        entradateclat = entradascanner.nextLine ();

        System.out.println ("El missatge es: \"" + entradateclat +"\"");
					}
}
