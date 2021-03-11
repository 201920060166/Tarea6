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
public class Datos {
    // PRIMER DATO
    private String Inmueble;   
    public String getInmueble()
    {
        return Inmueble;
    }
    public void setInmueble(String inmueble)
    {
        this.Inmueble = inmueble;
    }
    
    // SEGUNDO DATO
    private String Tipo;
    public String getTipo()
    {
        return Tipo;
    }
     public void setTipo(String tipo)
    {
        this.Tipo = tipo;
    }
    
     // TERCER DATO
    private int Habitaciones;
    public int getHabitaciones()
    {
        return Habitaciones;
    }
    public void setHabitaciones(int habitaciones)
    {
        this.Habitaciones = habitaciones;
    }
    
    // CUARTO DATO
    private String Zona;
    public String getZona()
    {
        return Zona;
    }
    public void setZona(String zona)
    {
        this.Zona = zona;
    }
    
    // QUINTO DATO
    private String Costo;
    public String getCosto()
    {
        return Costo;
    }
    public void setCosto(String valor)
    {
        this.Costo = valor;
    }
    
}
