/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author under
 */
public class exercici4 {
 public static void main(String[] args) {
 int x=8;
 int y=5;
 boolean compara=(x<y);
 System.out.println("x<y es "+compara);
 compara=(x>y);
 System.out.println("x>y es "+compara);
 compara=(x==y);
 System.out.println("x==y es "+compara);
 compara=(x!=y);
 System.out.println("x!=y es "+compara);
 compara=(x<=y);
 System.out.println("x<=y es "+compara);
 compara=(x>=y);
 System.out.println("x>=y es "+compara);
 try {
//espera la pulsación de una tecla y luego RETORNO
//aquest programa compara les dos variables (X i Y) i segons la operació que realitzem amb ell, ens mostrará el valor boleá de la operació.
 System.in.read();
 }catch (Exception e) { }
 }
}
