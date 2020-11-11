import java.util.Scanner;
class exercici4 {
  public static void main(String[] args) {
      System.out.println("Escriba una hora, en formato hora, minutos y segundos.");
      System.out.println("Introduzca solo la hora:");
      
      Scanner scanner=new Scanner(System.in);
        int hora =scanner.nextInt();
        
      System.out.println("Introduzca los minutos:");
      
        int minutos =scanner.nextInt();
        
      System.out.println("Introduzca los segundos:");
      
        int segundos =scanner.nextInt();
   
        if (hora>24 || minutos>59 || segundos>59) {
            System.out.println("Hora introducida incorrecta");
        } else {
            if (segundos==59) {
                segundos = 00;
                minutos++;
            } else {
                segundos++;
            }
            
            
            
            
            if (minutos==60) {
                    minutos = 00;
                    hora++;
                }
         
            if (hora==25) {
                segundos = 00;
                minutos = 00;
                hora = 00;
            }
            
            }
        
        
        System.out.println(hora+":"+minutos+":"+segundos);
        
    }  
  }
