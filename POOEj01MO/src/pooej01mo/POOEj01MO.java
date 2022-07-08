/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01mo;

import Entidad.Persona;

/**
 *
 * @author Gaston
 */
public class POOEj01MO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        Persona persona2 = new Persona("Gaston");
        
        persona1.setNombre("Andres");
        
        System.out.println(persona2.getNombre());
        System.out.println(persona1.getNombre());
        
        persona2.setApellido("Fernandez");
        persona2.setEdad(33);
        
        mostrarPersona(persona2);
    }
    
    public static void mostrarPersona(Persona p){
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Apellido: "+p.getApellido());
        System.out.println("Edad: "+p.getEdad());
    }
}
