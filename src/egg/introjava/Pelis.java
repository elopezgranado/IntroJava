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
public class Pelis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opinion;
        System.out.println("Clasifique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli...");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena!");
                    break;
                case 5:
                    System.out.println("Fantástico que haya disfrutado un excelente entretenimiento!!");
                    break;
            }
        }
        else if (opinion < 0) {
                System.out.println("¿Una opinión negativa? ¿Taaaaan mala fue la película? :(");
                }
        else if (opinion == 0) {
                System.out.println("El valor " + opinion + " no es válido y no se tomará en cuenta :(");
                }
        else {
                System.out.println(opinion + "! Wow! Se te fue la mano con la calificación! :D");
                }
        System.out.println("Hasta la próxima!");
    }
}    
