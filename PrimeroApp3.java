import java.util.Scanner;

public class PrimeroApp3 {
    	public static void main(String[] argv) 
        throws Exception 
    { 
  
        System.out.println ("Introdueix la teva edat:");

        String entradateclat = "";

        Scanner entradascanner = new Scanner (System.in);

        entradateclat = entradascanner.nextLine ();

            if (entradascannerInt()) { 
               System.out.println ("El següent any la teva edat será: \"" + entradateclat +"\"");
					} 
  
            else { 
                System.out.println("No has introduit un nombre");
                                 
           	 } 
        }
}
