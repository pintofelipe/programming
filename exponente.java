package com.mycompany.version1;
import java.util.*;
/**
 * 
 * @author pinto
 */
public class Exponente {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,w,r;
        
        System.out.println("Ingrese un número: ");
        n = input.nextInt();
        
        System.out.println("Ingrese el Exponente: ");
        w = input.nextInt();
        int i;
        
        r = n;
        for(i=1; i<w; i++){
            r = r*n;
            System.out.println("El resultado es: "+r);
        } 
        
        
    }
}