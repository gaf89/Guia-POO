/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01op2;

import Entidad.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author norae
 */
public class POOEj01OP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        LibroServicio ls = new LibroServicio();
        
        Libro L1 = new Libro();
        
        ls.cargarLibro(L1);
        
        ls.mostrarLibro(L1);
        
    }
    
}
