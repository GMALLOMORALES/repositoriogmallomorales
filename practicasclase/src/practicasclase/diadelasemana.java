/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasclase;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class diadelasemana {
    public static void main(String args []){
        System.out.println("Dame el numero de el dia de la semana");
        Scanner verDia = new Scanner(System.in);
        int dia = verDia.nextInt();
        switch (dia){
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miercoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sabado"); break;
            case 7: System.out.println("Domingo");break;
            default: System.out.println("no se");
        }
        
        
        
    }
    
}
