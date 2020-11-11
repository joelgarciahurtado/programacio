import java.util.Scanner;
class exercici5 {
  public static void main(String[] args) {
      System.out.println("Escriba un año, del 1940 al 2030");
            Scanner scanner=new Scanner(System.in);
        int any =scanner.nextInt();
        int Gener = 31;
        int Febrer = 28;
        int Març = 31;
        int Abril = 30;
        int Maig = 31;
        int Juny = 30;
        int Juliol = 31;
        int Agost = 31;
        int Septembre = 30;
        int Octubre = 31;
        int Novembre = 30;
        int Decembre = 31;
        
      if (any >2030 || any <1940) {
	System.out.println("l'any introduit no es correcte");
        }
      
      if ( any % 4 == 0 || any % 100 == 0 && any % 400 == 0) {
			Febrer = 29;
        }
      
      System.out.println("en l'any "+any+" Gener te "+Gener+" dies");
      System.out.println("en l'any "+any+" Febrer te "+Febrer+" dies");
      System.out.println("en l'any "+any+" Març te "+Març+" dies");
      System.out.println("en l'any "+any+" Abril te "+Abril+" dies");
      System.out.println("en l'any "+any+" Maig te "+Maig+" dies");
      System.out.println("en l'any "+any+" Juny te "+Juny+" dies");
      System.out.println("en l'any "+any+" Juliol te "+Juliol+" dies");
      System.out.println("en l'any "+any+" Agost te "+Agost+" dies");
      System.out.println("en l'any" +any+" Septembre te "+Septembre+" dies");
      System.out.println("en l'any "+any+" Octubre te "+Octubre+" dies");
      System.out.println("en l'any "+any+" Novembre te "+Novembre+" dies");
      System.out.println("en l'any "+any+" Decembre te "+Decembre+" dies");
      
      
      
      
      
}
}