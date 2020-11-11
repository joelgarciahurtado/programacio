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
public class exercici5 {
    public static void main(String[] args) {
    System.out.println("escriba un numero");
    Scanner scannernum=new Scanner(System.in);
    int num =scannernum.nextInt();
    if (num%2==0 && num%5==0) {
        System.out.println("el " + num + " es par i múltiplo de 5.");
    } else {
        System.out.println("el " + num + " no es par i/o múltiplo de 5.");
    } 
    }
}