/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Mascota;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in);
    
    public Mascota crearMascota(){
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        System.out.println("Introducir edad");
        int edad = leer.nextInt();
        
        return new Mascota(apodo, tipo, 0);
    }
}
