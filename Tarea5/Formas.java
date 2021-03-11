/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 * @author ErikZ
 */
public class Formas {
    // LAS PROPIEDADES DE LA CLASE
    private String dibujo;
    private String color;
    // NUEVAS PROPIEDADES
    private String radio;
    private String largo;
    private String angulo;
    private String area;
    
// CONSTRUCTOR
    public Formas(){
    //SIN PARAMETROS    
        
}
    // METODOS
    //ES Y OB
    public void establecerDibujo(String dibujo){
        this.dibujo = dibujo;
    }
    public String obtenerDibujo(){
        return this.dibujo;
    }
    
    public void establecerColor(String Color){
        this.color = Color;
    }
    public String obtenercolor(){
        return this.color;
    }
    //NUEVOS METODOS
    public void establecerRadio(String radio){
        this.radio = radio;
    }
    public String obtenerRadio(){
        return this.radio;
    }
    public void establecerLargo(String largo){
        this.largo = largo;
    }
    public String obtenerLargo(){
        return this.largo;
    }
    public void imprimirDato(){
        System.out.println("Dibujo:" + dibujo);
        System.out.println("Color:" + color);
        System.out.println("Radio:" + radio);
        System.out.println("Largo:" + largo);
    
    }
}
