/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasclase;

/**
 *
 * @author Guillermo
 */
public class Metodoaleatorio {
       /**
     * esta función crea números aleatorios fijando un mínimo y un máximo
     * @param aleatorio
     * @return 
     */
    public static int aleatorio(int num1, int num2){
       int aux;
       int numaleatorio1;
        if(num1>num2){
           aux=num2;
           num2=num1;
           num1=aux;
           
       }do{
        
              numaleatorio1 = (int) (Math.random()*num2)+1;
          }while(numaleatorio1 < num1 || numaleatorio1>num2);
       return numaleatorio1;
        
    }
    public static void main(String[] args) {
        int num;
        do {
           num = aleatorio(25,45);
            System.out.println(num);
        } while ( num!=35);
        
        
        
    }
    
}
