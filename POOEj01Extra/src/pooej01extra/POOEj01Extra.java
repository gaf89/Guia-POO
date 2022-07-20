/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01extra;

import Entidad.Cancion;

/**
 *
 * @author Gaston
 */
/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
*/
public class POOEj01Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cancion c1 = new Cancion();
        
        System.out.println(c1.getAutor()+"-"+c1.getTirulo());
        System.out.println(c1.toString());
    }
    
}
