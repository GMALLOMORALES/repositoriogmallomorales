/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author Usuario
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x,y;
        x=3;
        y=++x;
        System.out.println("Resultado con prefijo: x = " + x + " y = " + y);
        
        x=3;
        y=x++;
        System.out.println("Resultado con postfijo: x = " + x + " y = " + y);
    }
    
}
