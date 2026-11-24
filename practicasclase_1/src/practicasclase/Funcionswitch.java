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
public class Funcionswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame dos numeros");
        System.out.println("Numero 1:");
        int num1 = sc.nextInt();
        System.out.println("Numero 2:");
        int num2 = sc.nextInt();
        System.out.println("Elige una opcion\n1:Suma\n2:Resta\n3:Multiplicacion\n4:Division");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1: System.out.println("El resultado es:"+ (num1+num2));break;
            case 2: System.out.println("El resultado es:"+ (num1-num2));break;
            case 3: System.out.println("El resultado es:"+ (num1*num2));break;
            case 4: System.out.println("El resultado es:"+ (num1/num2));break;
                       
            
        }
    }
    
}
