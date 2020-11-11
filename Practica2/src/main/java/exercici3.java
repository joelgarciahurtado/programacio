/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author under
 */
public class exercici3 {
 public static void main(String[] args) {
 int i=8;
 int a, b, c;
 System.out.println("\tantes\tdurante\tdespués");
 i=8; a=i; b=i++; c=i;
 System.out.println("i++\t"+a+'\t'+b+'\t'+c);
 i=8; a=i; b=i--; c=i;
 System.out.println("i--\t"+a+'\t'+b+'\t'+c);
 i=8; a=i; b=++i; c=i;
 System.out.println("++i\t"+a+'\t'+b+'\t'+c);
 i=8; a=i; b=--i; c=i;
 System.out.println("--i\t"+a+'\t'+b+'\t'+c);
 try {
//espera la pulsación de una tecla y luego RETORNO
//aquest programa ens mostra l'ordre d'execució de les operacions, segons tinguin la variable abans o després de la operació a aplicar.
 System.in.read();
 }catch (Exception e) { }
 }
}
