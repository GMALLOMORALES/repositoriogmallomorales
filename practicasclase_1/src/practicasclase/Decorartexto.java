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


public class Decorartexto {

    public static String decorartexto(String texto) {
        int length = texto.length();
        String asteriscos = "**";

        for (int i = 0; i < length; i++) {
            asteriscos += "*";
        }

        String resultado = asteriscos + "\n*" + texto + "*\n" + asteriscos;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Dame un texto");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        System.out.println(decorartexto(texto));
    }
}
