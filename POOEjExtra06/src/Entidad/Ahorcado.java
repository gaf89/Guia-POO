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
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
*/
public class Ahorcado {
    
    
    private String[] palabra;
    private String letra;
    private int letrasEncontradas, jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int jugadasMaximas) {
        this.palabra = palabra;
        this.jugadasMaximas = jugadasMaximas;
    }

    public Ahorcado(String[] palabra, String letra, int letrasEncontradas, int jugadasMaximas) {
        this.palabra = palabra;
        this.letra = letra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }
    
    
    public String[] getPalabra() {
        return palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public String getLetra() {
        return letra;
    }
    
    
    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
}
