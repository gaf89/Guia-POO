/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

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
public class MatematicaServicio {

    public String devorverMayor(Matematica m) {
        String mayor;
        double num1 = m.getNumero1();
        double num2 = m.getNumero2();

        if (num1 > num2) {
            mayor = "numero1";
        } else {
            mayor = "numero2";
        }
        m.setMayor(mayor);
        
        return mayor;
    }

    public double calcularPotencia(Matematica m) {
        String mayor = m.getMayor();
        double numMayor, numMenor, potencia;

        if (mayor.endsWith("numero1")) {
            numMayor = Math.round(m.getNumero1());
            numMenor = Math.round(m.getNumero2());
        } else {
            numMayor = Math.round(m.getNumero2());
            numMenor = Math.round(m.getNumero1());
        }
      
        potencia = Math.pow(numMayor, numMenor);

        return potencia;
    }

    public double calcularRaiz(Matematica m) {
        String mayor = m.getMayor();
        double numMenor, raiz;

        if (mayor.endsWith("numero1")) {
            numMenor = Math.abs(m.getNumero2());
        } else {
            numMenor = Math.abs(m.getNumero1());
        }
        
        raiz = Math.sqrt(numMenor);
        
        return raiz;
    }
}
