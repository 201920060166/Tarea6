/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.tarea3;

/**
 *
 * @author ErikZ
 */
public class BienesInmuebles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CODIGO DE APLICACION
        
          Datos inventario = new Datos();
      inventario.setInmueble("Casa");
      inventario.setTipo("Sencilla");
      inventario.setZona("Urbana");
      inventario.setHabitaciones(3);
      inventario.setCosto("400,000 Lps");
      // DATOS A MOSTRAR EN LA PANTALLA
      System.out.println("Inmueble:" + inventario.getInmueble());
      System.out.println("Tipo:" + inventario.getTipo());
      System.out.println("Habitaciones:" + inventario.getHabitaciones());
      System.out.println("Zona:" + inventario.getZona());
      System.out.println("Costo:" + inventario.getCosto());
           
    }
    
}
