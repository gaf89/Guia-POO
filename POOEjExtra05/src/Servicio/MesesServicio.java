/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author norae
 */
public class MesesServicio {
    Scanner leer = new Scanner(System.in);
    
    public void adivinaElMes(Meses m) {
        String mesSecreto = m.getMesSecreto();
        
        System.out.println("Adivine el mes secrero");
        System.out.println("");
        System.out.print("Introduzca el nombre del mes en minúsculas: ");
        String respuesta;
                
        do {
        respuesta = leer.next();
        System.out.println("");
        if (respuesta.equals(mesSecreto)) {
            System.out.println("");
            System.out.println("¡¡Has acertado!!");
            break;
        } else {
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");                 
        }
        } while (!respuesta.equals(mesSecreto));
        System.out.println("");
    }
}
