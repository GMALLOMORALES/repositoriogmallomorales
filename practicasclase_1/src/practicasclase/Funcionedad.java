/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasclase;

import java.util.Scanner;

/**
 *@param edad representa la edad de la persona
 * @author Guillermo
 */
public class Funcionedad {
    public static String ver(int num){
        String resultado = "";
        String resultadover = "";
        if(num>=18){
          resultadover += "Eres mayor de edad";
        }else{
           resultadover+="Eres menor de edad";
        }return ""+resultadover;
        
    }
    
    public static void main(String[] args) {
        System.out.println("Dame tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        System.out.println(ver(edad));
        
    }
    
}
