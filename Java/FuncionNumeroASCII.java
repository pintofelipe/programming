
package com.mycompany.funcionnumeroascii;

/**
 *
 * Crea una función que nos devuelva el número ASCII de un caracter pasado por parametro.
 */
public class FuncionNumeroASCII {

    public static void main(String[] args) {
        char caracter = 'a';
        
        int f = devuelveCodigoASCII(caracter);
        
        System.out.println("El caracter "+caracter+" tiene el código "+f);
    }
    
    public static int devuelveCodigoASCII(char caracter){
    
        return (int)caracter;
    }
}
