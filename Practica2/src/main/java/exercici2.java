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
public class exercici2 {
    public static void main(String[] args) {
   System.out.println("escriba un numero");
   Scanner dato=new Scanner(System.in);
   int farenheit=dato.nextInt();
   int celsius=((farenheit-32)*5)/9;
   System.out.println("el resultado es"+celsius);
    }
}
