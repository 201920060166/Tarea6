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
public class OperacionesMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CODIGO DE APLICACION
        float N1;
        float N2;
        float resultado;
        String leer;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer número\n");
        N1 = scanner.nextFloat();
          
        System.out.println("Digite el Segundo número\n");
        N2 = scanner.nextFloat();
        
        //Suma
        resultado = N1 + N2;
        System.out.println("\n La respuesta de la suma es: "+ resultado);
        
        //Resta
        resultado = N1 - N2;
        System.out.println("\n La respuesta de la resta es: "+ resultado);
        
        //Multiplicacion
        resultado = N1 * N2;
        System.out.println("\n La respuesta de la multiplicación es: "+ resultado);
        
        //Division
        resultado = N1 / N2;
        System.out.println("\n La respuesta de la división es: "+ resultado);
    }
    
}
