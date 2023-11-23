
package com.mycompany.funciones1;

/**
 *
 * Crea un a función que devuelva la suma de 2 numeros, pasados por parametro
 */
public class Funciones1 {

    public static void main(String[] args) {
        int numero = suma(70,7);
        System.out.println("La suma es de :"+numero);
    }
    
    public static int suma(int n1, int n2){
    
        int n = n1+n2;
        
        
        return n;
    }
}
