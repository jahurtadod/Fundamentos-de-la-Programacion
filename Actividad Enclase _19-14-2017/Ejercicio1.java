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
        
        // creacion de variables
        String dia;
        
        // Ingreso de variables
        System.out.print("Ingrese el  dia: ");
        dia = datos.next().toLowerCase();
                
        // Opciones
        switch(dia){
            case "lunes":
                System.out.print("G.P.");
                break;
            case "martes":
                System.out.print("Contabilidad");
                break;
            case "miercoles":
                System.out.print("F. de la Programación");
                break;
            case "jueves":
                System.out.print("Matemáticas Discretas");
                break;
            case "viernes":
                System.out.print("Estadistica");
                break;              
            default :
                System.out.print("Sin actividad");  
        }
    }
    
}
