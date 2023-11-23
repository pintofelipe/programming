

package com.mycompany.funcionmayor;

// crear una función que indique si un número es mayor o menor que cero.

public class FuncionMayor {

    public static void main(String[] args) {
        int n = 7;
        
        if(numero(n)){
            System.out.println("El número "+n+" es mayor que cero: ");
        }else{
            System.out.println("El número "+n+" es menor o igual que 0");
        }
    }
    
    public static boolean numero(int n){
        
       return n>0;
    }
}
