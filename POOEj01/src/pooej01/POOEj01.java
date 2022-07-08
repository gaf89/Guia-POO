/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author norae
 */
/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Libro L1 = new Libro();
        
        cargarLibro(L1);
        
        mostrarLibro(L1);
    }
    
     public static void cargarLibro(Libro l){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Tntroducir ISBN:");
        l.setISBN(leer.nextInt());
        
        System.out.println("Tntroducir Título:");
        l.setTitulo(leer.next());
        
        System.out.println("Tntroducir Autor:");
        l.setAutor(leer.next());
        
        System.out.println("Tntroducir Nùmero de páginas:");
        l.setNumPag(leer.nextInt());
    }
    
    public static void mostrarLibro(Libro l){
        
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("ISBN: "+l.getISBN());
        System.out.println("Título: "+l.getTitulo());
        System.out.println("Autor: "+l.getAutor());
        System.out.println("Número de páginas: "+l.getNumPag());
        System.out.println("---------------------------------");
    }
}
