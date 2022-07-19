/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/
public class POOEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
                       
        System.out.println("Introducir una fecha");
        System.out.print("Día: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        mes -= 1;
        System.out.print("Año: ");
        int anio = leer.nextInt();
        anio -= 1900;
        
        Date fecha = new Date(anio,mes,dia);
        
        //fecha.setDate(dia);
        //fecha.setMonth(mes);
        //fecha.setYear(anio);
        
        Date fechaActual = new Date(); 
        
        System.out.println("Fecha ingresada: ");
        //System.out.println(fecha.getDate()+"/"+fecha.getMonth()+"/"+fecha.getYear());
        System.out.println(fecha.toString());
        
        //System.out.println(fechaActual.getDate()+"/"+fechaActual.getMonth()+"/"+fechaActual.getYear());
        System.out.println("Fecha actual:");
        System.out.println(fechaActual.toString());
        System.out.println("");
              
        System.out.println("La Diferencia entre la fecha ingresada y la fecha es de "+(fechaActual.getYear()-fecha.getYear())+" año/s");
    }

}