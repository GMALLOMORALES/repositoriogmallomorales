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
public class FuncionTablas {
    /**
     * esta funcion devuelve la tabla de el numero introducido en un string
     * la funcion no realiza la distincion entre el numero de la tabla
     * @param num
     * @return tabla de multiplicar del numero como string
     */
    
    public static String tablaMultiplicar(int num){
        String tabla = "";
        String partetabla;
        for (int i = 1; i <= 10; i++) {
            partetabla = (num + " * " + i + " = " + num*i + "\n");
            tabla = tabla + partetabla;
            
            
        } return tabla;
        
        
                
        
        
    
    
    
}
    
    public static void main(String[] args) {
        System.out.println("Dame un numero para hacer la tabla");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        do{
            System.out.println("el número debe estar entre 2 y 10");
              numero = sc.nextInt();  
                
            }while(numero<2 || numero>10);
        String respuesta = tablaMultiplicar(numero);
        System.out.println("la tabla solicitada es: ");
        System.out.println(respuesta);
        
        
        
      
        
        
        
        
    }
    
}
