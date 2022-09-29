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
public class VectorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j, sum;
        String aux;
        
        int[] vector;           // Declaración del vector
        vector = new int[2];    // Dimensionar el tamaño del vector (por defecto lo inicializa en 0)
        
        int[] producto = new int[3];
        
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}}; // Declarar y dimensionar una matriz
        
        System.out.println("Ingrese los valores del vector de tamaño "+vector.length+":");
        Scanner leer = new Scanner(System.in);
        
        // Cargar vector
        for (i=0; i<vector.length; i++) {
            System.out.print("v["+i+"]=");
            vector[i] = leer.nextInt();
        }
        
        // Multiplicar vector por matriz
        for (i=0; i<matriz[0].length; i++) {
            sum = 0;
            for (j=0; j<vector.length; j++) {
                sum += vector[j] * matriz[j][i];
            }
            producto[i] = sum;
        }
        
        // Mostrar vector
        aux = "";
        System.out.println("\nVector:");
        for (int elemento:vector) {
            aux += " " + elemento;
        }
        System.out.println("["+aux+" ]");
        
        // Mostrar matriz
        System.out.println("\nMatriz:");
        for (int[] fila:matriz) {
            aux = "";
            for (int elemento:fila) {
                aux += " " + elemento;
            }
            System.out.println("["+aux+" ]");
        }
        
        // Mostrar resultado
        aux = "";
        System.out.println("\nVector x Matriz");
        for (int elemento:producto) {
            aux += " " + elemento;
        }
        System.out.println("["+aux+" ]");
    }
    
}
