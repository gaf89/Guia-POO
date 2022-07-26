/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.

*/
public class AhorcadoServicio {
    
    /*• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0. */
    
    public Ahorcado crearJuego() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introducir la palabra a adivinar: ");
        String palabra = "programar"; // leer.next();
        System.out.print("Introducir cantidad de jugadas máximas: ");
        int jugadas = leer.nextInt();
        int longitud = palabra.length();
        
        String[] vector = new String[longitud];
        
        for (int i = 0; i < longitud; i++) {
            vector[i] = palabra.substring(i, i+1);
        }
        
        return new Ahorcado(vector, jugadas);
    }
    
    /*• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.*/
    
    public int longitud(Ahorcado a) {
        int longitud = a.getPalabra().length;
               
       return longitud;
    }
    
    /*• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
    
    public void buscar(Ahorcado a) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una letra: ");
        String letra = leer.next();
        
        a.setLetra(letra);
        
        String[] palabra = a.getPalabra();
        int encontrado = 0;
                
        for (int i = 0; i < longitud(a); i++) {
            if (letra.equals(palabra[i])) {
                encontrado++;
            }
        }
        
        int encontradastotal = a.getLetrasEncontradas();
        encontradastotal += encontrado;
        
        System.out.println("");
        if (encontrado > 0) {
            System.out.println("La letra pertenece a la palabra");
            a.setLetrasEncontradas(encontradastotal);
        } else {
            System.out.println("La letra NO pertenece a la palabra");
        }
    }
    
    /*• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.*/
    
    public boolean encontradas(Ahorcado a) {
        String letra = a.getLetra();
        
        boolean encontradas;
        String[] palabra = a.getPalabra();
        int longitud = longitud(a);
        int cantEncotrados = 0;
                
        for (int i = 0; i < longitud; i++) {
            if (palabra[i].equals(letra)) {
                cantEncotrados++;
            }
        }
        
        System.out.println("Número de letras (encontradas/faltantes): ("+a.getLetrasEncontradas()+"/"+(longitud-a.getLetrasEncontradas())+")");
        
        encontradas = cantEncotrados > 0;
        
        return encontradas;
    }
    
    /* • Método intentos(): para mostrar cuantas oportunidades le queda al jugador.*/
    
    public void intentos(Ahorcado a) {
        int jugadas = a.getJugadasMaximas();
        
        if (encontradas(a) == false) {
            jugadas -= 1;
        }
        
        a.setJugadasMaximas(jugadas);
        System.out.println("");
        System.out.println("Número de oportunidades restantes: "+jugadas);
    }
    
    /* 
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
    
    public void juego() {
        Ahorcado a1 = crearJuego();
       
        do {
        System.out.println("------------------------------------------");
        System.out.println("Longitud de la palabra: "+longitud(a1));
        System.out.println("");
        buscar(a1);
        System.out.println("");
        intentos(a1);
        System.out.println("");
        if (a1.getLetrasEncontradas() == longitud(a1)) {
            System.out.print("Felicidades, la palabra correcta es: ");
            String[] palabra = a1.getPalabra();
            for (int i = 0; i < longitud(a1); i++) {
                System.out.print(palabra[i]);
            }
            System.out.println("");
            break;
        }
        } while (a1.getJugadasMaximas() > 0);
    }

}
