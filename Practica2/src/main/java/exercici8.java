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
public class exercici8 {
    public static void main(String[] args) {
    System.out.println("introduzca tres notas, realizaremos una media entre ellas");
    Scanner scanner=new Scanner(System.in);
    double nota1=scanner.nextDouble();
    double nota2=scanner.nextDouble();
    double nota3=scanner.nextDouble();
    
    if (nota1 <0 || nota2 <0 ||nota3 <0 ||nota1 >10 || nota2 >10 || nota3 >10) {
        System.out.println("notas introducidas no válidas, por favor, introduce una nota entre el 0 y el 10");
    } else {
    double media =(nota1 + nota2 + nota3) / 3;
    System.out.println("la media de las notas es " + media);
    }
 
}
}