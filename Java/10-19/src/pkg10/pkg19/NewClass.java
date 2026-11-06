/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.pkg19;

/**
 *
 * @author Guillermo
 */
import java.util.Random;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rnd = new Random();

        // Variables para el control de estadísticas globales
        int totalPuntosGlobal = 0;
        int cantidadTiradas = 0;
        String opcion = "";

        System.out.println("=== BIENVENIDO AL JUEGO DE LOS 3 DADOS ===");
        System.out.println("Presione Enter para lanzar los dados o escriba 'F' para finalizar.\n");

        // Bucle principal del juego
        while (true) {
            System.out.print("¿Desea tirar los dados? (Presione Enter / 'F' para salir): ");
            opcion = teclado.nextLine();

            // Verificar si el usuario desea finalizar el juego
            if (opcion.equalsIgnoreCase("f")) {
                break; // Sale inmediatamente del bucle while
            }

            // Lanzamiento de los 3 dados (rango 1 a 6)
            int dado1 = rnd.nextInt(6) + 1;
            int dado2 = rnd.nextInt(6) + 1;
            int dado3 = rnd.nextInt(6) + 1;

            // Cálculo del acumulado de la tirada actual
            int acumuladoTirada = dado1 + dado2 + dado3;

            // Actualización de estadísticas globales
            totalPuntosGlobal += acumuladoTirada;
            cantidadTiradas++;

            // Mostrar resultados de la iteración actual
            System.out.println("\n--- RESULTADO DE LA TIRADA #" + cantidadTiradas + " ---");
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("Dado 3: " + dado3);
            System.out.println("Acumulado de esta tirada: " + acumuladoTirada + " puntos");
            System.out.println("-------------------------------------\n");
        }

        // Cierre del Scanner
        teclado.close();

        // Pantalla final con estadísticas resumidas
        System.out.println("\n=========================================");
        System.out.println("           JUEGO FINALIZADO              ");
        System.out.println("=========================================");
        System.out.println("Número total de tiradas realizadas: " + cantidadTiradas);
        System.out.println("Acumulado total de puntos obtenidos: " + totalPuntosGlobal);
        System.out.println("=========================================");
    }
}

        
    
    
    

