/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc6;

/**
 *
 * @author omarz
 */

/*Enunciado
Ejercicio resuelto Nº 11
Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
ellos. 
*/

import java.util.Scanner;

public class Actividad2Exc6 {

    public static void main(String[] args) {
        
        int Num1, Num2, Num3, hNumber;
        
        System.out.println("Ingrese el primer numero entero: ");
        Scanner uno = new Scanner(System.in);
        
        Num1 = uno.nextInt();
        
        System.out.println("Ingrese el segundo numero entero: ");
        Scanner dos = new Scanner(System.in);
        
        Num2 = dos.nextInt();

        System.out.println("Ingrese el tercer numero entero: ");
        Scanner tres = new Scanner(System.in);
        
        Num3 = tres.nextInt();
        
        if ((Num1 > Num2) && (Num1 > Num3)){
            
            hNumber = Num1;
            
        }
        else if (Num2 > Num3){
            
            hNumber = Num2;
            
        }
        else {
            
            hNumber = Num3;
        }
        
        System.out.println("El numero mayor es el: " + hNumber);
    }
}
