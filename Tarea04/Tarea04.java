/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ErikZ
 */
public class Tarea04 {
    public static void main(String[] args) {
        //PRIMERA PARTE
        Doctor doctor = new Doctor();
        
        
        doctor.setNombre("Jean Carlo");
        doctor.setApellido("Jaramillo");
        doctor.setEdad(32);
        doctor.setAñosExperiencia(8);
        
        
        System.out.println("Nombre Doctor:" + doctor.getNombre() + " " + doctor.getApellido());
        System.out.println("Edad: " + doctor.getEdad());
        System.out.println("Años de experiencia: " + doctor.getAñosExperiencia());
        System.out.println();
        
        //SEGUNDA PARTE
        CesamoGuinope cGuinope = new CesamoGuinope();
        HospitalSuazoCordova hSuazoC = new HospitalSuazoCordova();
        HospitalSanGorge hSanGorge = new HospitalSanGorge();
        
       
        System.out.println(cGuinope.getNombreHospital() + ", Director(a): " + cGuinope.getDirector());
        System.out.println(hSuazoC.getNombreHospital() + ", Director(a): " + hSuazoC.getDirector());
        System.out.println(hSanGorge.getNombreHospital() + ", Director(a): " + hSanGorge.getDirector());

    }
}
