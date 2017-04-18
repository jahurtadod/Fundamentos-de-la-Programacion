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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creación de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
        
        // Creación de variables
        String descripcion;
        int unidades;
        double costoproduccion;
        double costomaterial = 3.5;
        
        // Ingreso de datos por el usuario
        System.out.print("Ingrese el número de unidades: ");
        unidades = datos.nextInt();
        System.out.print("Ingrese una descripción del producto: ");
        descripcion = datos.next();
        
        // Operaciones
        costoproduccion = unidades * costomaterial +10700;
        
        // Se muestra el resultado
        System.out.print("El costo de producción es de: $" +costoproduccion);
                       
    }
    
}
