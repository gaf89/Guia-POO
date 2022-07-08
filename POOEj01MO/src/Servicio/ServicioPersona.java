/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class ServicioPersona {
    
    private Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        return new Persona(nombre);
    }
    
}
