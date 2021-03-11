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
public class CuartoMetodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CODIGO DE APLICACION
        Enlistado lista = new Enlistado();
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.print("Ingrese el numero mayor de la lista que desee imprimir: ");
        N = scanner.nextInt();
        
        lista.Lista(N);
    }
    
}
