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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se crea la variable para pedir por consola los datos
        Scanner tiempo = new Scanner(System.in);
                
        // Creación de variables
        double horas, dias, minutos, segundos;
        
        // Ingreso de datos por el usuario
        System.out.print("Ingrese la cantidad de horas: ");
        horas= tiempo.nextDouble();
        
        // Operaciones
        dias = horas / 24;
        minutos = horas * 60;
        segundos = horas * 3600;
               
        // Se muestra el resultado
        System.out.print("La cantidad de "+horas+" horas equivalen a:\n");
        System.out.print(+dias+" dias\n"+minutos+" minutos\n"+segundos+" segundos");     
    }
    
}
