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
public class HolaMundo { //Clase

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Método main
        //Variable Scanner (propia de Java) para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //Variable cadena(String)
        String nombre;
        //Muestra por pantalla
        System.out.println("Ingresa tu nombre:");
        //Asigna a la variable nombre lo ingresado por pantalla
        nombre = leer.next();
        //Muestra por pantalla
        System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en JAVA!");
    }
    
}
