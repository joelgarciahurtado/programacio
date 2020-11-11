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
public class exercici9 {
     public static void main(String[] args) {
    System.out.println("introduzca un numero decimal, el programa redondeará el numero a entero");
    Scanner scanner=new Scanner(System.in);
    double num= scanner.nextDouble() + 0.5 ;
    int redondeado = (int) num;
    System.out.println(redondeado);
}
}