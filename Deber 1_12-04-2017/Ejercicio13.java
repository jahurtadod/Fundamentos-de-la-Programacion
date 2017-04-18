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
public class Ejercicio13 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se crea la variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
                
        // Creación de variables
        double radio, volumen, area;
                
        // Ingreso de datos por el usuario
        System.out.print("Ingrese el radio de la esfera: ");
        radio= datos.nextDouble();
        
        // Operaciones
        volumen = (4* Math.PI * Math.pow(radio,3))/3;
        area = Math.PI * Math.pow(radio,2);
               
        // Se muestra el resultado
        System.out.print("El volumen de la esfera es de: "+volumen+"\n");
        System.out.print("El área de la esfera es de: "+area);
        
    }
    
}
