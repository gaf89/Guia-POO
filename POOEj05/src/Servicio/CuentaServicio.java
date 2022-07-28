/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import Entidad.Cuenta;

/**
 *
 * @author norae
 */
/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
*/
public class CuentaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        
        System.out.println("Introducir Número de Cuenta:");
        int numeroCuenta = leer.nextInt();
        
        System.out.println("Introducir Número de DNI:");
        long dni = leer.nextLong();
        
        System.out.println("Introducir Saldo Actual:");
        int saldo = leer.nextInt();
        
        System.out.println("Introducir Interes:");
        int interes = leer.nextInt();
        
        return new Cuenta(numeroCuenta, saldo, interes, dni);
    }
    
    public double ingresar(Cuenta c){
        
        System.out.println("Ingreso de saldo");
        System.out.println("Introducir Monto a Ingresar:");
        double ingreso = leer.nextDouble();
        
        int saldo = c.getSaldoActual();
        
        saldo += ingreso;
        
        c.setSaldoActual(saldo);
        
        return saldo;
    }
    
     public double retirar(Cuenta c){
        
        System.out.println("Retiro de Sado");
        System.out.println("Introducir Monto a Retirar:");
        double retiro = leer.nextDouble();
        
        int saldo = c.getSaldoActual();
       
        if (saldo < retiro){
            c.setSaldoActual(0);
            saldo = 0;
        }else{
            saldo -= retiro;

            c.setSaldoActual(saldo);
        }
        
        return saldo;
     }
     
     public void extraccionRapida(Cuenta c){
     
        System.out.println("Extracción Rápida");
        System.out.println("Introducir Monto a Retirar:");
        double retiro = leer.nextDouble();
        
        int saldo = c.getSaldoActual();
        
        if(retiro > (saldo * 0.2)){
            System.out.println("NO es posible realizar la operacion, El Retíro supera el 20% del saldo");
        }else{
             saldo -= retiro;

            c.setSaldoActual(saldo);
        }

     }
     
     public void consultaSaldo(Cuenta c){
         
         System.out.println("Su Saldo Actual es: $"+c.getSaldoActual());
     }
     
     public void consultaDatos(Cuenta c) {
         
         System.out.println("--------------------------------------");
         System.out.println("Numero de Cuenta: "+c.getNumeroCuenta());
         System.out.println("Número de DNI: "+c.getDni());
         System.out.println("Saldo Actual: $"+c.getSaldoActual());
         System.out.println("Interes: "+c.getInteres());
         System.out.println("--------------------------------------");
     }
}
