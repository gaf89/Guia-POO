/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej04;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

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
public class POOEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        RectanguloServicio rs = new RectanguloServicio();
        
        Rectangulo r1 = rs.crearRectangulo();
                
        System.out.println("Superficie: "+rs.Superficie(r1));
        
        System.out.println("Perimetro: "+rs.Perimetro(r1));
        
        rs.dibujarRectangulo(r1);
        
    }
    
}
