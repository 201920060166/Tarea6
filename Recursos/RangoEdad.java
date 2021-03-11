/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.Recursos;

/**
 *
 * @author ErikZ
 */
public class RangoEdad {
     public static void VerificarEdad(int edad)
    {
        if (edad >= 21) {
            System.out.print("Mayor de edad");
        }
        else
        {
            System.out.print("Menor de edad");
        }
    }

}
