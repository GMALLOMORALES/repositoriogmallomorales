/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasclase;

/**
 *
 * @author Guillermo
 */
public class Stringformat {
    public static void main(String[] args) {
        int tabla = 2;
        int resultado;
        for (int i = 1; i <= 10; i++) {
            String fila = String.format("%d * %2d = %04d",tabla, i, tabla*i);
            System.out.println(fila);
            
            
        }
        
    }
    
}
