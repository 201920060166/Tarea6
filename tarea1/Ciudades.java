/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.tarea1;

import java.util.Scanner;

/**
 *
 * @author ErikZ
 */
public class Ciudades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CODIGO DE APLICACION
        Scanner scanner = new Scanner(System.in);
       String[] ciudades = new String[20];
       int contador = 1;
       
       System.out.print("Digite el nombre de 20 ciudades");
        for (int E = 0; E < 20; E++) {
            System.out.print("\n Digite ciudad Número " + contador + ":" );
            ciudades[E] = scanner.next();
            contador= contador + 1;
        }  
        
        System.out.print("\n Las ciudades guardadas son:");
        for (int E = 0; E <20; E++) {
            System.out.print("\n" + ciudades[E]);
        }
    }
    
}
