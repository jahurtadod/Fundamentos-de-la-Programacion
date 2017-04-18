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
public class Ejercicio7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se crea la variable para pedir por consola los datos
        Scanner tiempo = new Scanner(System.in);
                
        // Creación de variables
        double celsius, fahrenheit;
                
        // Ingreso de datos por el usuario
        System.out.print("Ingrese la tempuratura en grados Celsius: ");
        celsius= tiempo.nextDouble();
        
        // Operaciones
        fahrenheit = (9/5) * celsius + 32;
               
        // Se muestra el resultado
        System.out.print("Su equivalente es: "+fahrenheit+" grados Fahrenheit");
        
    }
}
