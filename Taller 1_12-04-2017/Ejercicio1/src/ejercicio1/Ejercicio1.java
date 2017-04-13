/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author jahur
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea la variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
        // Creación de variables
        double costo,anchura,longitud;
        double costototal;
        // Ingreso de datos por el usuario
        System.out.print("Ingrese la longitud del terreno: ");
        longitud = datos.nextDouble();
        System.out.print("Ingrese la anchura del terreno: ");
        anchura = datos.nextDouble();
        System.out.print("Ingrese el costo por metro cuadrado del terreno :");
        costo = datos.nextDouble();
        // Operaciones
        costototal = longitud * anchura * costo;
        // Se muestra el resultado
        System.out.print("El costo del terreno es : " +costototal);
                
    }
    
}
