
import java.util.Scanner;
public class exercici2 {
    public static void main(String[] args) {
        System.out.println("Escriba un numero para calcular el factorial");
        Scanner scanner=new Scanner(System.in);
        int num =scanner.nextInt();
        int aux = 1;
    
        
        if (num!=0){
        
                                
        while (num!=0) {
            aux=aux*num;
            num--;
        }
        
            

            }
        
        
               System.out.println(aux);
        
        }
        

    }
