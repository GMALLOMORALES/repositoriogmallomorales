/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.pkg19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class p22 {public static void main(String[] args) {
            System.out.println("dame un numero x");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num<0){System.out.println("x es menor que 0");
            }
            else if (num==0){ System.out.println("x es igual a 0");
            }
            else if ((num>0 && num<10)) { System.out.println("x es mayor que 0 y menor que 10");
            }
            else if (num==10){ System.out.println("x es igual a 10");
            }
            else if ((num>10 && num<20)) { System.out.println("x es mayor que 10 y menor que 20");
            }
            else if (num>=20) System.out.println("x es mayor o igual a 20");
            }
    }
    

