/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author under
 */
import java.util.Scanner;
public class exercici3 {
     public static void main(String[] args) {
    System.out.println("introduzca una nota del 0 al 10");
    Scanner scanner=new Scanner(System.in);
    int nota= scanner.nextInt();
    
    if (nota <0 || nota >10) {
        System.out.println("error,introduzca una nota que esté comprendida entre el 0 y el 10");
    } else {
         if (nota >=0 && nota<=4) {
             System.out.println("Insuficiente");
        } else {
             if (nota==5) {
                 System.out.println("Suficiente");
             } else {
                    if (nota==6) {
                            System.out.println("Bien");
                         } else {
                             if (nota >=7 || nota<=8) {
                                 System.out.println("Notable");
                             } else {
                                 if (nota >=9 || nota <=10) {
                                     System.out.println("Sobresaliente");
                                 }
                             }
                         }
             }
         }
     }
}
}
