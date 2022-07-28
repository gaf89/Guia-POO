/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
public class RectanguloServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
                
        System.out.println("Introducir la altura del rectángulo:");
        int alt = leer.nextInt();
        System.out.println("Introducir la base del rectángulo:");
        int bas = leer.nextInt();
        
        return new Rectangulo(bas, alt);
    }
    
    public int Superficie(Rectangulo r){
        
        int superficie = r.getBase() * r.getAltura();
        
        return superficie;
    }
    
    public int Perimetro(Rectangulo r){
        
        int perimetro = (r.getBase() + r.getBase()) * 2;
        
        return perimetro;
    }
    
    public void dibujarRectangulo(Rectangulo r){
        
        int b,a;
        b = r.getBase();
        a = r.getAltura();
        System.out.println("");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || j == 1 || i == a || j == b){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }                
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
