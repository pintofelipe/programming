package com.mycompany.matrizaleatoria;

import java.util.Scanner;

/**
 *
 * Crear una matriz de 5 filas y n columnas (se pide al usuario).
 * Rellenarlo con números aleatorios entre 0 y 10.
 */
public class MatrizAleatoria {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Escribe un número de columnas ");
        int columnas = sc.nextInt();
        
        int matriz[][] = new int[5][columnas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[0].length; j++) {
                matriz[i][j] = generaNumAleatorio(0, 9);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        
    }
    
    
    public static int generaNumAleatorio(int minimo, int maximo){
        
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
}
