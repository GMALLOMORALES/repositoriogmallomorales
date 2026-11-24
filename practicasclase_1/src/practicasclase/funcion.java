/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasclase;

/**
 *
 * @author Guillermo
 */
public class funcion {     
    public static int suma(int num1, int num2){
               return num1+num2;
    }
    
    
    public static void main(String[] args) {
        System.out.println("la suma de dos numeros");
        int resultado = suma(1,1);
        String mensaje = String.format("la suma de: %d y %d es: %d",1,1,resultado);
        System.out.println(mensaje);
          
  
    }
    
}
