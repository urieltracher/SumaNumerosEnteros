/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumanumerosenteros;

/**
 *
 * @author 
 */
import java.util.Scanner;

public class SumaNumerosEnteros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = obtenerSumaNumerosEnteros(input);
        mostrarResultado(suma);
    }
    
    public static int obtenerSumaNumerosEnteros(Scanner input) {
        int numero, suma = 0;
        do {
            System.out.print("Ingresa un número entero positivo: ");
            numero = input.nextInt();
            if(numero > 0) {
                suma += numero;
            }
        } while(numero > 0);
        return suma;
    }
    
    public static void mostrarResultado(int suma) {
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}

