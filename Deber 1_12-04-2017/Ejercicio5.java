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
public class Ejercicio5 {
    
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se crea la variable para pedir por consola los datos
        Scanner tiempo = new Scanner(System.in);
                
        // Creación de variables
        int segundos, distancia;
        int velocidadluz = 300000;
        
        // Ingreso de datos por el usuario
        System.out.print("Ingrese el tiempo de recorrido (segundos): ");
        segundos= tiempo.nextInt();
        
        // Operaciones
        distancia = segundos * velocidadluz;
               
        // Se muestra el resultado
        System.out.print("La distancia recorrida por la luz es de: "+distancia+"km");
          
    }
}
