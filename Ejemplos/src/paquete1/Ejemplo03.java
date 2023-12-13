/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        int[] arreglo1 = new int[5]; 
        // En el arreglo uno declaramos en la misma linea de que tipo es 
        // y el numero de elementos
        
        // arreglo de tipo entero
        int[] arreglo2;
        arreglo2 = new int[5];
        //En el arreglo2 declaramos de que tipo es en una linea 
        // y en otra el numero de elementos
        
        // arreglo de tipo entero
        int[] arreglo3 = {5, 10, 15, 20, 25}; // sin new
        // En esta linea se le da directamente el valor a los elementos y ya no
        // es necesario poner el new ni de cuantos valores sera el arreglo
        
       
        // arreglo de doubles - 3 elementos
        double[] arreglo4 = {5.1, 10.2, 15.2}; // sin new
        // Lo mismo que el arreglo3 pero con decimales.
        
        // arreglo de cadenas - 4 elementos
        String[] arreglo5 = {"Loja", "Quito", "Zamora", "Machala"};
        // En esta linea se le da directamente el valor a los elementos y ya no
        // es necesario poner el new ni de cuantos valores sera el arreglo
        // coloca valores de tipo cadena
    }

}
