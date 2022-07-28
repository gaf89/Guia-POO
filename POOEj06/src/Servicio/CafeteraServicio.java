/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/
public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera c){
        
        c.setCantidadActual(c.getCapacidadMaxima());
        System.out.println("Cafetera Llena");
    }
    
    public void servirTaza(Cafetera c){
        
        System.out.println("Ingrese el tamaño de la taza(ml) a llenar:");
        int taza = leer.nextInt();
        
        int capActual = c.getCantidadActual();
        
        if (taza <= capActual){
            capActual -= taza;            
            System.out.println("La taza se ha llenado");
        }else{
            System.out.println("La cantidad actual, No alcanza para llenar la taza");
            System.out.println("La taza se ha cargado con: "+capActual+" ml de café");
            capActual = 0;
        }
        c.setCantidadActual(capActual);
    }
    
    public void vaciarCafetera(Cafetera c){
        c.setCantidadActual(0);
        System.out.println("La Cafetera se ha vaciado");
    }
    
    public void agregarCafe(Cafetera c){
        
        System.out.println("Introducir la cantidad de café(ml) a agregar:");
        int cafeAgreagar = leer.nextInt();
        
        c.setCantidadActual(c.getCantidadActual()+cafeAgreagar);
    }
    
    public void cantidadActual(Cafetera c){
        System.out.println("----------------------------------------------------");
        System.out.println("Cantidad actual de café: "+c.getCantidadActual()+" ml");
    }
}
