/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("dame un numero: ");
        int x = entrada.nextInt();
        
           System.out.println("SU CUADRADO ES: " + (int)Math.pow(x,2));
        System.out.println("SU CUBO ES: " + (int)Math.pow(x,3));
    }
}
