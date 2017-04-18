/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg3.ejercicios.propuestos;
import java.util.Scanner;
/**
 * Jorge Hurtado
 * 12/04/2017
 */
public class Ejercicio9 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se crea la variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
                
        // Creación de variables
        String articulo;
        double costo, precioventa;
        double utilidad, impuesto;
        
        // Ingreso de datos por el usuario
        System.out.print("Ingrese el nombre del articulo: ");
        articulo= datos.next();
        System.out.print("Ingrese el costo del producto: ");
        costo = datos.nextDouble();
        
        // Operaciones
        utilidad = costo * 1.5;
        impuesto = costo * 0.15;
        precioventa = costo + utilidad + impuesto;
               
        // Se muestra el resultado
        System.out.print("El articulo: "+articulo+"\n");
        System.out.print("Tiene una utilidad de: $"+utilidad+"\n");
        System.out.print("Tiene un impuesto de: $" +impuesto+"\n");
        System.out.print("Su precio de venta es: $" +precioventa);
    }
    
}
