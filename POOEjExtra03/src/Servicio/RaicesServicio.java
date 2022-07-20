/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;

/**
 *
 * @author Gaston
 */
/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
public class RaicesServicio {

    /*• Método getDiscriminante(): devuelve el valor del discriminante (double). El
    discriminante tiene la siguiente formula: (b^2)-4*a*c  */
    public double getDiscriminante(Raices r) {
        int a = r.getA();
        int b = r.getB();
        int c = r.getC();

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        return discriminante;
    }
    
    /* • Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0. */
    
    public boolean tieneRaices(Raices r) {
        boolean raices = getDiscriminante(r) >= 0;
        
        return raices;
    }
    
    /* • Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0. */
    
    public boolean tieneRaiz(Raices r) {
        boolean raiz = getDiscriminante(r) == 0;
        
        return raiz;
    }
    
    /* • Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones. Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b */
    
    public void obtenerRaices(Raices r) {
        double a = r.getA();
        double b = r.getB();
        double c = r.getC();
        
        double formula;
        
        if (tieneRaices(r)) {
            formula = (Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println("Las 2 soluciones son:");
            System.out.println("Solución 1: "+(-b + formula));
            System.out.println("Solución 2: "+(-b - formula));
        }
    }
    
    /* • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
en el caso en que se tenga una única solución posible. */
    
    public void obtinerRaiz(Raices r) {
        
    }
}
