/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
*/
public class OperacionServicio {
 
    public Operacion crearOperacion(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introducir 2 números:");
        System.out.print("Numero 1: ");
        int numero1 = leer.nextInt();
        System.out.print("Numero 2: ");
        int numero2 = leer.nextInt();
        
        return new Operacion(numero1, numero2);        
    }
    
    public int sumar(Operacion o){
        int suma = o.getNumero1() + o.getNumero2();
        return suma;
    }
    
    public int restar(Operacion o){
        int resta = o.getNumero1() - o.getNumero2();
        return resta;
    }
    
    public int multiplicar(Operacion o){
        
        int num1,num2,multi;
        num1 = o.getNumero1();
        num2 = o.getNumero2();
        
        if (num1 == 0 || num2 == 0){
            System.out.println("ERROR, almenos uno de los 2 números es igual a 0");
            multi = 0;
        }else{
            multi = num1 * num2;
        }
        
        return multi;
    }
    
    public double division(Operacion o){
                
        double num1,num2,div;
        num1 = o.getNumero1();
        num2 = o.getNumero2();
        
        if (num1 == 0 || num2 == 0){
            System.out.println("ERROR, almenos uno de los 2 números es igual a 0");
            div = 0;
        }else{
            div = num1 / num2;
        }
        
        return div;
    }
}
