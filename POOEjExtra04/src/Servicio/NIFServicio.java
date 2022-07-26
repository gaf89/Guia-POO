/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author norae
 */
/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
*/
public class NIFServicio {
    /*• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
    corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
    resultado del calculo. */
    
    public NIF crearNif() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Intruducir número de DNI: ");
        long dni = leer.nextLong();
        
        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        
        String letra = vector[(int) dni % 23];
      
        return new NIF(dni, letra);
    }
    
    /* • Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
    mayúscula; por ejemplo: 00395469-F). */
    
    public void mostrar(NIF n) {
        
        String dniCadena = Integer.toString((int) n.getDni());
        int digitos = dniCadena.length();
        
        System.out.println("---------------------");
        System.out.print("NIF: ");
        if ((8 - digitos) > 0) {
            for (int i = 0; i < 8 - digitos; i++) {
                System.out.print("0");
            }
        }
        System.out.println(n.getDni()+"-"+n.getLetra());
        System.out.println("---------------------");
    }
}
