/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel Garcia Hurtado
 */
public class exercici3 {

    public static void main(String[] args) {
        int contador = 0; //declaro la variable contador que me ayudará a imprimir los primos

        for (int i = 3; i <= 100; i++) { //creo un bucle para recorrer todos los numeros del 3 al 100

            for (int j = 1; j <= i; j++) { //creo un bucle para ir dividiendo por cada numero, todos los numeros que hay entre ese primer numero y el 1, y sumo a contador cuando esa división da residuo 0, de esa manera encuentro los primos
                if (i % j == 0) {
                    contador++;
                }

            }
            if (contador ==2) { //creo una condición en la qual cuando el contador llega a dos, es decir, el numero es primo, imprimo ese numero por pantalla
                System.out.println(i);
                
            }
                contador = 0; //es importante que esta nueva asignación este aqui, de esta manera, solo reseteamos el contador cuando imprimimos el primer primo, y por lo tanto los bucles pueden seguir girando.
        }

    }
}
