/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
*/
public class PuntosServicio {
    
    public Puntos crearPuntos() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introducir las coordenadas de los dos puntos");
        System.out.println("Punto 1");
        System.out.print("Eje X: ");
        int x1 = leer.nextInt();
        System.out.print("Eje Y: ");
        int y1 = leer.nextInt();
        System.out.println("Punto 2");
        System.out.print("Eje X: ");
        int x2 = leer.nextInt();
        System.out.print("Eje y: ");
        int y2 = leer.nextInt();
        
        return new Puntos(x1, x2, y1, y2);
    }
    
    public double calcularDistancia(Puntos p) {
        int x1 = p.getX1();
        int x2 = p.getX2();
        int y1 = p.getY1();
        int y2 = p.getY2();
        
        double distancia;
        
        distancia = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
     
        return distancia;
    }
    
}
