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
public class Ejemplo041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "";
        // Declarar y generar arreglos en Java
        
        // arreglo de tipo entero
        //int[] arreglo1 = new int[5];
        int[] arreglo1 = {1000, 1, 2, 2000, 300};
        // System.out.println(arreglo1.length);
        //arreglo1[2] = 1000;
        for (int i = 0; i < arreglo1.length; i++) {
            //El length asociado a un arreglo me da el numero de elementos que 
            //tiene el arreglo asociado
            cadena = String.format("%sSubíndice o Índice %d, con valor %d\n",
                    cadena,i, arreglo1[i]);
        
        }
        System.out.println(cadena);
    }

}
