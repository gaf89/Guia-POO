/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;

import java.util.Arrays;

/**
 *
 * @author Gaston
 */
/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
public class POOEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double A[] = new double[50];
        double B[] = new double[20];
               
        for (int i = 0; i < 50; i++) {
            Arrays.fill(A, i,i+1,(Math.random() * 10));
        }
        
        System.out.println("Arreglo A:");
        System.out.println(Arrays.toString(A));
                
        Arrays.sort(A);
        
        for (int i = 0; i < 10; i++) {
            Arrays.fill(B, i, i+1, A[i]);            
        }
        
        Arrays.fill(B, 10, 19, 0.5);
        
        System.out.println("Arreglo A:");
        System.out.println(Arrays.toString(A));
        
        System.out.println("Arreglo B:");
        System.out.println(Arrays.toString(B));
        
        
        
        
        /*
        for (int i = 0; i < 50; i++) {
            for (int j = i; j < 50; j++) {
                if (A[j] < menor) {
                    menor = A[j];
                    ubicacion = j;
                }
            }
            aux = A[i];
            A[i] = A[ubicacion];
            A[ubicacion] = aux;
            menor = 9999999;
        }
        */
    }

}
