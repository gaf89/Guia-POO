/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextra05;

import Entidad.Meses;
import Servicio.MesesServicio;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
*/
public class POOEjExtra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
       
        Scanner leer = new Scanner(System.in);
        
        Meses m1 = new Meses();
        
        MesesServicio ms = new MesesServicio();
        
        ms.adivinaElMes(m1);
        
        
        
        
        /*String mesSecreto = m1.getMesSecreto();
        
        System.out.println("Adivine el mes secrero");
        System.out.print("Introduzca el nombre del mes en minúsculas: ");
        String respuesta;
        
        do {
        respuesta = leer.next();
        if (respuesta.equals(mesSecreto)) {
            System.out.println("");
            System.out.println("¡¡Has acertado!!");
            break;
        } else {
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");                 
        }
        } while (!respuesta.equals(mesSecreto));*/
    }
    
}
