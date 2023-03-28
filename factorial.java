package com.mycompany.factorial;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int i;
        int p=1;
        System.out.println("Ingrese un número: ");
        n = input.nextInt();
        
        for(i=1; i<=n; i++){
            p = p*i;
            System.out.println("El factorial es: "+p);
        }
    }
}