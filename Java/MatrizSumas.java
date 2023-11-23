

package com.mycompany.matrizsumas;

import java.util.Scanner;

/*
Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz.
los valores y la longitud, seran intersectados por el usuario. Mostrar las matrices originales y el resultado.
 */
public class MatrizSumas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese las filas para las matrices: ");
        int f = sc.nextInt();
        
         System.out.print("Ingrese las columnas para las matrices: ");
        int c = sc.nextInt();
        
        int matriz1[][] = new int[f][c];
        int matriz2[][] = new int[f][c];
        int matrizTotal[][] = new int[f][c];
        
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print("Ingrese el valor para la matriz 1 en la posición "+(i+1)+" "+(j+1)+": ");
                matriz1[i][j] = sc.nextInt();
                System.out.print("Ingrese el valor para la matriz 2 en la posición "+(i+1)+" "+(j+1)+": ");
                matriz2[i][j] = sc.nextInt();
                
                matrizTotal[i][j] = matriz1[i][j]+matriz2[i][j];
            }
            System.out.println(" ");
        }
        
        
        /*
        //en este for muestra la matriz 1 ingresada por teclado
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        System.out.println(" #######################################");
        
        // en este for muestra la matriz 2 ingresada por teclado
         for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println(" ");
        }
         
         System.out.println(" #######################################");
        
        //hace la suma de las dos matrices 
        for (int i = 0; i < matrizTotal.length; i++) {
            for (int j = 0; j < matrizTotal[0].length; j++) {
                matrizTotal[i][j] = matriz1[i][j]+matriz2[i][j]; 
            }
            System.out.println(" ");
        }
        
        // en este for muestra el resultado de haber sumado las dos matrices anteriores
        for (int i = 0; i < matrizTotal.length; i++) {
            for (int j = 0; j < matrizTotal[0].length; j++) {
                System.out.print(matrizTotal[i][j]+" ");
            }
            System.out.println(" ");
        }
        */
        System.out.println("La matriz 1");
        imprimir(matriz1);
        System.out.println("La matriz 2");
        imprimir(matriz2);
        System.out.println("resultado");
        imprimir(matrizTotal);
    }
    
    
    //Este metodo es para imprimir una matriz
    public static void imprimir(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
