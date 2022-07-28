/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
*/
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona() {
        
        
        System.out.println("Introducir datos");
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Introducir echa de nacimiento");
        System.out.print("Día: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        mes -= 1;
        System.out.print("Año: ");
        int anio = leer.nextInt();
        anio -= 1900;
        
        Date fechaDeNacimiento = new Date();
        
        fechaDeNacimiento.setDate(dia);
        fechaDeNacimiento.setMonth(mes);
        fechaDeNacimiento.setYear(anio);
        
        return new Persona(nombre, fechaDeNacimiento);
    }
    
    public int calcularEdad(Persona p) {
        
        Date fechaActual = new Date();
        int dia = p.getFechaDeNacimiento().getDate();
        int mes = p.getFechaDeNacimiento().getMonth();
        int anio = p.getFechaDeNacimiento().getYear();
        int edad;
        
         edad = fechaActual.getYear() - anio;
        
        if (mes >= fechaActual.getMonth() && dia > fechaActual.getDate()) {
            edad -= 1;
        }
        
        return edad;
    }
    
    public boolean menorQue(Persona p) {
               
        int edad = calcularEdad(p);
        
        System.out.println("Introducir una edad: ");
        int edadNueva = leer.nextInt();

        boolean menor = edad < edadNueva;
        
        return menor;
    }
    
    public void mostrarPersona(Persona p) {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(p.toString());
        System.out.println("----------------------------------------------------------------------------------------");
    }
    
}
