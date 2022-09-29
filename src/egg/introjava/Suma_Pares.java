/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Suma_Pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, suma, i, j;
        String confirma;
        
        //Mientras
        do {
            System.out.println("Ingrese un número positivo");
            num = leer.nextInt();
            
            if (num > 1000) {
                System.out.println("Este programa podría tardar ¿Está seguro? (s/n)");
                confirma = leer.next();
                if (confirma.equals("s")) {
                    break; //Detiene el bucle y continúa con el próximo bloque
                }
            }
        } while (num <= 0 || num > 1000);
        
        //Para
        for (i=1 ; i <= num ; i++){ // i++ --> i = i + 1
            
            if (i%2 != 0) //El valor de i divido 2 da como resto 0 (módulo de 2) - pares
                continue; //Detiene la iteración actual y salta a la siguiente
            
            suma = 0;
        //Mientras
            j = 1;
            while (j <= i) {
                suma += j; // suma = suma + j
                j++;
            }
            System.out.println("La suma de los " + i + " números naturales es: " + suma);
        }
    }
}
