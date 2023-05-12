

package com.mycompany.arreglos;

import java.util.*;
public class Arreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Arreglo[] = new int[5];
        
        Arreglo[0]=35;
        Arreglo[1]=333;
        Arreglo[2]=356578;
        Arreglo[3]=35984;
        Arreglo[4]=35442;
        
        int i = 0;
        
        for(;i<5;i++){
            System.out.print("["+Arreglo[i]+"]");
        }
    }
}
