

package com.mycompany.factorialrecursividad;

import java.util.Scanner;

/**
 *
 * @author pinto
 */
public class FactorialRecursividad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int n = sc.nextInt();
      
        int f = factorial(n);
        
         System.out.println("El Factorial de "+n+" es: "+f);
        
    }

    public static long factorial(long n){
        if(n<=1){
            return n;
        }
        return n*factorial(n-1);
    }
    
    //factorial(5);
    
    
    public static int factorial(int n){
           int  f =1;
        
        for (int i = 2; i <= n; i++) {
            f *=i;
        }
        return f;
       
    }
    
}
