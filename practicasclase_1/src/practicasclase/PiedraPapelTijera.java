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
public class PiedraPapelTijera {
    
    public static String Eleccion(String eleccion){
        int numeroelegido = (int) (Math.random()*3)+1;
        if (numeroelegido==1)
        {    
        eleccion = "Piedra";
        }
        else
        {
        if(numeroelegido==2){
        eleccion = "Papel";
        }
        else
        {
        if(numeroelegido==3){
        eleccion = "Tijera";
     
                    
                    
        }
                    
            
            
        }
        
        
        }   return eleccion;
    }

    
    
    public static void main(String[] args) {
       String eleccion = "";
       boolean jugar = true;

       eleccion = eleccion + (Eleccion(eleccion));
        System.out.println("Para jugar a piedra, papel, tijera, \n elige lo que quieras lanzar \n 1: Piedra \n 2: Papel \n 3: Tijera");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        while(opcion!=1 && opcion!=2 && opcion!=3){
            System.out.println("Esa opción no existe. Elige 1, 2 o 3");
            opcion = sc.nextInt();
        }
        switch(opcion){
            case 1: if(eleccion.equals("Papel")){System.out.println("La máquina a elegido papel,\nHas perdido");};
            if(eleccion.equals("Piedra")){System.out.println("La máquina a elegido piedra,\nHas empatado");};
            if(eleccion.equals("Tijera")){System.out.println("La máquina a elegido Tijera,\nHas ganado");};
            ; break;
            case 2: if(eleccion.equals("Tijera")){System.out.println("La máquina a elegido tijera,\nHas perdido");}
            if(eleccion.equals("Papel")){System.out.println("La máquina a elegido papel,\nHas empatado");};
            if(eleccion.equals("Piedra")){System.out.println("La máquina a elegido piedra,\nHas ganado");};
            ; break;
              case 3: if(eleccion.equals("Piedra")){System.out.println("La máquina a elegido piedra,\nHas perdido");};
            if(eleccion.equals("Tijera")){System.out.println("La máquina a elegido tijera,\nHas empatado");};
            if(eleccion.equals("Papel")){System.out.println("La máquina a elegido papel,\nHas ganado");};
            ; break;
        }}}
     
            
            
        
        
        
        
        
    
    

