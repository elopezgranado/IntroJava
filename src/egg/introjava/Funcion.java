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
public class Funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = sumar(10,10);
        System.out.println(resultado);
        
        saludoPersonalizado("Esteban");
        Scanner leer = new Scanner(System.in);
        String estado = leer.next();
        String bien = "Bien";
        
        if (estado == bien) {
            System.out.println("¡Que bueno!");
        }
        else {
            System.out.println("Aburridooooo");
        }
    }
    
    public static int sumar(int a, int b) {
        int res = a + b;
        return res;
    }
    
    public static void saludoPersonalizado(String nombre) {
        System.out.println("Hola "+nombre+" ¿Cómo estás?");
    }
}
