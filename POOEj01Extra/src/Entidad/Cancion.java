/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

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
public class Cancion {
    
    private String tirulo, autor;

    
    public Cancion() {
        this.tirulo = "";
        this.autor = "";
    }

    public Cancion(String tirulo, String autor) {
        //this.tirulo = tirulo;
        //this.autor = autor;
    }

    public String getTirulo() {
        return tirulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTirulo(String tirulo) {
        this.tirulo = tirulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
