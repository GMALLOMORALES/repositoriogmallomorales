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
public class Buclefor {public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
            System.out.println("dame el numero de incio");
            int inicio = sc.nextInt();
            System.out.println("dame el numero de fin");
            int fin = sc.nextInt();
            System.out.println("dame el numero de incremento");
            int incremento = sc.nextInt();
            for(int i=inicio ; i<=fin; i+=incremento){
            System.out.println(i);};

            
//for(int 1=3, int j=2; i*j<100; i+=3, j+=2)   
}
    
}

//usando un bucle for, el usuario nos da tres numeros
//el valor de inicio del bucle
//el valor de fin del bucle
//y la cantidad de pasos en cada iteracion
//se mostrara los numeros correspondientes
//ejemplo inicio=10, fin=20, incremento=3
//mostrara: 10, 13, 16,19
    // for(int 1=3, int j=2; i*j<100; i+=3, j+=2){
           // System.out.println("j vale: "+ j + " i vale: "+ i);

