/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.Recursos;

import java.util.Scanner;

/**
 *
 * @author ErikZ
 */
public class TercerMetodo {
    public static void main(String[] args) {
        // CODIGO DE APLICACION
        
        Scanner scanner = new Scanner(System.in);
        Evaluar operacion = new Evaluar();
        int N1;
        int N2;
        System.out.print("MULTIPLICACION DE DOS NUMEROS");
        System.out.print("\n Ingrese numero 1: ");
        N1 = scanner.nextInt();
        
        System.out.print("\n Ingrese numero 2: ");
        N2 = scanner.nextInt();
        
        Evaluar.Multiplicar(N1, N2);
    }
    
}
