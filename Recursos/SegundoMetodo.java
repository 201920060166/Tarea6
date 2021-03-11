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
public class SegundoMetodo {

    public static void main(String[] args) {
        // CODIGO DE APLICACION
        
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.print("Ingresa tu edad: ");// IMPRIMIR TEXTO
        edad = scanner.nextInt();
        
        RangoEdad verificar = new RangoEdad();       
        verificar.VerificarEdad(edad);
    }
    
}
