/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel Garcia Hurtado
 */
import java.util.Scanner;
public class exercici1 {
    public static void main(String[] args) {
        System.out.println("Escriba un numero para calcular el factorial");
        Scanner scanner=new Scanner(System.in);
        int num =scanner.nextInt();
        int aux = 1;
    
        
        if (num!=0){
        
            for (int i = num; i>0;i--) {

                aux=aux*i;
            }
        }
        
        System.out.println(aux);
                    

    }
}