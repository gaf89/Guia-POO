/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej07;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Gaston
 */
/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
*/
public class POOEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int imc[] = new int[4];
        boolean mayor[] = new boolean[4];
        
        PersonaServicio ps = new PersonaServicio();
        
        Persona p1 = ps.crearPersona();
        Persona p2 = ps.crearPersona();
        Persona p3 = ps.crearPersona();
        Persona p4 = ps.crearPersona();
        
        imc[0] = ps.calcularIMC(p1);
        imc[1] = ps.calcularIMC(p2);
        imc[2] = ps.calcularIMC(p3);
        imc[3] = ps.calcularIMC(p4);
                        
        mayor[0] = ps.esMayorDeEdad(p1);
        mayor[1] = ps.esMayorDeEdad(p2);
        mayor[2] = ps.esMayorDeEdad(p3);
        mayor[3] = ps.esMayorDeEdad(p4);
        
        /*
        for (int i = 0; i < 2; i++) {
            System.out.println(imc[i]);
            System.out.println(mayor[i]);
        }
        */
                           
        porcentajeIMC(imc);
        porcentajeMayores(mayor);
        
    }
    
    public static void porcentajeIMC(int imc[]) {
       
        double contbajo,contideal,contalto;
        contbajo = 0;
        contideal = 0;
        contalto = 0;
        
        for (int i = 0; i < 4; i++) {
            switch (imc[i]) {
                case -1: 
                    contbajo++;
                    break;
                case 0: 
                    contideal++;
                    break;
                case 1: 
                    contalto++;
                    break;
            }
        }
        
        System.out.println("");
        System.out.println("El porcentaje de personas por debajo de su peso ideal es: "+(contbajo/4*100)+"%");
        System.out.println("El porcentaje de personas en su peso ideal es: "+(contideal/4*100)+"%");
        System.out.println("El porcentaje de personas por encima de su peso ideal es: "+(contalto/4*100)+"%");
    }
    
    public static void porcentajeMayores(boolean m[]) {
        
        double contMay, contMen;
        contMay = 0;
        contMen = 0;
        
        for (int i = 0; i < 4; i++) {
            if (m[i] == true) {
                contMay++;
            }else{
                contMen++;
            }
        }
        
        System.out.println("");
        System.out.println("El porcentaje de personas mayores de edad es: "+(contMay/4*100)+"%");
        System.out.println("El porcentaje de personas menores de edad es: "+(contMen/4*100)+"%");
    }
}
