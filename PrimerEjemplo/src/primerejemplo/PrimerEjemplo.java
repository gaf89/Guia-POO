/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejemplo;

import Entidad.Mascota;
import Servicios.ServicioMascota;
import java.util.Scanner;

/**
 *
 * @author norae
 */
public class PrimerEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota();
        
        m1.apodo = "Chiquito";
        m1.nombre = "Fernando";
        m1.edad = 8;
        m1.raza = "mestizo";
        
        Mascota m2 = new Mascota("Shino", "peroo", leer.nextInt());
        
        m1.setNombre("Chiqui");
        
        System.out.println(m1.nombre);
        
        System.out.println(m2);
        
        m1.pasear(100);
        System.out.println(m1);
        
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m3 = sm.crearMascota();
        
        m1 = null;
    }
    
}
