/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/
public class CadenaServicio {
    
    public int mostrarVocales(Cadena c) {
        
        String frase = c.getFrase();
        int longitud = c.getLongitud();
        String letra;
        int cantVocales = 0;
        
        for (int i = 0; i < longitud; i++) {
            letra = frase.substring(i, i+1);
            switch (letra) {
                case "a":
                case "A":
                case "e":
                case "E":
                case "i":
                case "I":
                case "o":
                case "O":
                case "u":
                case "U":
                    cantVocales++;
                    break;
            }
        }
        return cantVocales;
    }
    
    public void invertirFrase(Cadena c) {
        String frase, fraseInvertida, letra;
        int longitud = c.getLongitud()-1;
        frase = c.getFrase();
        fraseInvertida = "";
        
        for (int i = longitud; i >= 0; i--) {
            letra = frase.substring(i, i+1);
            
            fraseInvertida = fraseInvertida.concat(letra);
        }
        System.out.println("");
        System.out.println("*Frase Invertida*");
        System.out.println(fraseInvertida);
    }
    
    public void vecesRepetido(Cadena c) {
        Scanner leer = new Scanner(System.in);
        
        String frase, letra, letraRep;
        int longitud = c.getLongitud();
        int contRep = 0;
        frase = c.getFrase();
        
        System.out.println("");
        System.out.println("Introducir la letra a buscar");
        letraRep = leer.next();
        
        for (int i = 0; i < longitud; i++) {
            letra = frase.substring(i, i+1);
            if (letra.equals(letraRep)) {
                contRep++;
            }
        }
        System.out.println("El caracter '"+letraRep+"' se repite "+contRep+" veces");
    }
    
    public void compararLongitud(Cadena c) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Introducir una nueva frase");
        String frase = leer.nextLine();
        int longActual = frase.length();
        
        System.out.println("La longitud de la frase nueva es: "+longActual);
        System.out.println("La longitud de la frase anterior es: "+c.getLongitud());
    }
    
    public void unirFrases(Cadena c) {
        Scanner leer = new Scanner(System.in);
                        
        System.out.println("");
        System.out.println("Introducir la frase a unir");
        String fraseNueva = leer.nextLine();
        
        System.out.println(c.getFrase()+" "+fraseNueva);
    }
    
    public void reemplazar(Cadena c) {
        Scanner leer = new Scanner(System.in);
        
        String frase, letra, fraseNueva;
        int longitud = c.getLongitud();
        frase = c.getFrase();
        fraseNueva = "";
        
        System.out.println("");
        System.out.println("Introducir caracter que reemplazara la letra 'a'");
        String caracter = leer.next();
        
        for (int i = 0; i < longitud; i++) {
            letra = frase.substring(i, i+1);
            if (letra.equals("a")) {
                fraseNueva = fraseNueva.concat(caracter);
            }else{
                fraseNueva = fraseNueva.concat(letra);
            }
        }
        System.out.println(fraseNueva);
    }
    
    public boolean contiene(Cadena c) {
        Scanner leer = new Scanner(System.in);
        
        String frase, letra;
        frase = c.getFrase();
        int longitud = c.getLongitud();
        int cont = 0;
        
        System.out.println("");
        System.out.println("Introducir letra a buscar: ");
        String letraBuscar = leer.next();
        
        for (int i = 0; i < longitud; i++) {
            letra = frase.substring(i, i+1);
            if (letra.equals(letraBuscar)) {
                cont++;
            }
        }
        boolean contiene = cont > 0;
        return contiene;
    }
    
}
