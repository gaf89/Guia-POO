/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

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
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
                
        System.out.println("Introducir nombre: ");
        String nombre = leer.next();
        
        System.out.println("Introducir sexo ('H' hombre, 'M' mujer, 'O' otro):");
        String sexo = leer.next();
        if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println("Error, El valor introducido NO es válido");
        }
        
        System.out.println("Introducir edad: ");
        int edad = leer.nextInt();
        
        System.out.println("Introducir peso(kg): ");
        double peso = leer.nextDouble();
        
        System.out.println("Introducir altura(metros): ");
        double altura = leer.nextDouble();
        
        return new Persona(nombre, sexo, edad, peso, altura);
    }
    
    public int calcularIMC(Persona p){
        double peso = p.getPeso();
        double altura = p.getAltura();
        int imc = 0;
        double calculoImc = peso /(altura*altura);
        
        if (calculoImc < 20) {
            imc = -1;
        }else{
            if (calculoImc >= 20 && calculoImc <=25) {
                imc = 0;
            }
            if (calculoImc >25) {
                imc = 1;
            }
        }
        
        return imc;
    }
    
    public boolean esMayorDeEdad(Persona p) {
        
        int edad = p.getEdad();
        
        boolean mayorEdad = edad >= 18;        
        
        return mayorEdad;
    }
}
