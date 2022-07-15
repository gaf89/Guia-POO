/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej09;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author Gaston
 */
/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
public class POOEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Matematica m1 = new Matematica();
        MatematicaServicio ms = new MatematicaServicio();
        
        m1.setNumero1(Math.random()*10);
        m1.setNumero2(Math.random()*10);
        
        System.out.println("Número 1: "+m1.getNumero1());
        System.out.println("Número 2: "+m1.getNumero2());
        
        System.out.println("");
        System.out.println("El mayor de los 2 números es el '"+ms.devorverMayor(m1)+"'");
        
        System.out.println("");
        System.out.println("La Potencia del número mayor por el menor es: "+ms.calcularPotencia(m1));
        
        System.out.println("");
        System.out.println("la Raiz Cuadrada del número menor es: "+ms.calcularRaiz(m1));
    }
    
}
