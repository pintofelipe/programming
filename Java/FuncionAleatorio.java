

package com.mycompany.funcionaleatorio;

/**
 *
 * crear una función que devuelva un número aleatorio entre dos numeros enteros que nosostros les demos; 
 */
public class FuncionAleatorio {

    public static void main(String[] args) {
      int min = 0;
      int max = 10;
      
      int aleatorio = generaNumAleatorio(min, max);
        System.out.println(aleatorio);
    }
    
    public static int generaNumAleatorio(int minimo, int maximo){
    
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
}
