/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.pkg19;

/**
 *
 * @author alumno
 */

public class p10 {
    public static void main(String []args){
        
      int x,y;
      x=3;
      y=++x;
        System.out.println("Resultado con prefijo: x = " + x + " y = " + y);
      x=3;
      y=x++;
      System.out.println("Resultado con postfijo: x = " + x + " y = " + y);
    //Con prefijo, x vale 4 e y vale 4
    //Con postfijo, x vale 4 e y vale 3
    } 
}
