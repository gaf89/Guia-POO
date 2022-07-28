/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
*/
public class CircunferenciaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
                
        System.out.println("Introducir el radio de la circunferencia:");
        double radio = leer.nextDouble();
        
        return new Circunferencia(radio);
    }
    
    public double area(Circunferencia c){
                
        double r = c.getRadio();
        double area = Math.PI * (r*r);
       
        return area;
    }
    
    public double perimetro(Circunferencia c){
        
        double r = c.getRadio();
        double perimetro = 2 * Math.PI * r;
       
        return perimetro;
    }
    
   
}
