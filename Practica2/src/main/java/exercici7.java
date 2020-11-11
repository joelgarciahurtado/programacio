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
public class exercici7 {
    public static void main(String[] args) {
    System.out.println("escriba -32768 o 32767, sumaremos 1 y comprobaremos si se comportan de forma cíclica");
    Scanner scanner=new Scanner(System.in);
    short comprobacion =scanner.nextShort();
    
    if (comprobacion ==-32768 || comprobacion ==32767) {
        if (comprobacion ==-32768) {
            comprobacion -= +1;
            System.out.println(comprobacion);
        } else {
            comprobacion += +1;
            System.out.println(comprobacion);
        }
    } else {
        System.out.println("No has introducido un numero válido.");
    }
}
}