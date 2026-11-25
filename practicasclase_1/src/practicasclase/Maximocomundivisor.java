/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasclase;

import java.util.Scanner;

/**
 *
 * @author Guillermo
 */
public class Maximocomundivisor {

    public static void main(String[] args) {
        System.out.println("Dame dos numeros");
        System.out.println("Num a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Num b:");
        int b = sc.nextInt();
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;

        }
        System.out.println("MCD: " + a);
    }

}
