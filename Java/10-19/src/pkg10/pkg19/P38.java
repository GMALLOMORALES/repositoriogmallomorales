/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.pkg19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class P38 {public static void main(String[] args) {
        
            System.out.println("Dame el numero de horas");
            Scanner sc = new Scanner(System.in);
            int horas = sc.nextInt();
           int totalsegundos = horas * 3600;
            int totaldias = totalsegundos/86400;
            totalsegundos = totalsegundos % 86400;
            int horasrestantes = totalsegundos / 3600;
            totalsegundos = totalsegundos%3600;
            int minutosrestantes = totalsegundos / 60;
           totalsegundos = totalsegundos%60;
            System.out.println("Equivale a: "+ totaldias + " dias "+ horasrestantes + " horas " + minutosrestantes + " minutos y " + totalsegundos + " segundos");
            
    }
    
}
