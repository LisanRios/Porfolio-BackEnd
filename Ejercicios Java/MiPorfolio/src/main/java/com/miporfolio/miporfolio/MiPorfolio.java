/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.miporfolio.miporfolio;
import java.util.Scanner;
/**
 *
 * @author Lisan
 */
public class MiPorfolio {

    public static void main(String[] args) {
        double matriz[][] = new double [4][4];
        Scanner teclado = new Scanner (System.in);
        double suma = 0.0;
    
    for (int f = 0; f<4; f++) {
        for (int c = 0; c<3; c++) {
            System.out.println("Ingrese el alumno n° " + f);
            matriz[f][c] = teclado.nextDouble();  
            suma = suma + matriz[f][c];
        }
        matriz[f][3] = suma/3;
        suma = 0.0;
    }
    
    for (int f = 0; f<4; f++) {
        System.out.println("Las notas del alumno n° " + f + " son: ");
        for (int c = 0; c<3; c++) {
            System.out.println("La nota n° " + c + " " + matriz[f][c]);
        }
        System.out.println("El promedio de las notas es: " + matriz[f][3]);
    }
    }
}
