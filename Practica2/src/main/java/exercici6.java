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
public class exercici6 {
    public static void main(String[] args) {
    System.out.println("escriba su año de nacimiento y el año actual");
    Scanner scanner=new Scanner(System.in);
    int nacimiento =scanner.nextInt();
    int actual =scanner.nextInt();
    int edad =actual-nacimiento;
    
if (nacimiento > actual) {
    System.out.println("el año de nacimiento o el año actual introducidos no son correctos");
} else {
    System.out.println("su edad actual es " + edad);
        }
    }
}
