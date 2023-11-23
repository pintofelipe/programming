

package com.mycompany.matricesejercicio1;

/**
 *
 * Crear una matriz con los números del 1 al 9. Mostrar por pantalla, tal
 * como aparece en la matriz.
 */
public class MatricesEjercicio1 {

    public static void main(String[] args) {
        
        int matriz[][] = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=(i*matriz.length+(j+1));
                System.out.print(matriz[i][j]+" ");     
            }
            System.out.println("");
        }
        
   
        
       
        /*int f[][] = {
            {1,2,3},{4,5,6},{7,8,9}
        };
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+f[i][j]+"]");
            }
            System.out.println("");
        }
*/
    }
}
