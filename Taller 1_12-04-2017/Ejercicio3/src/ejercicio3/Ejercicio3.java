/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author jahur
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea la variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
        // Creación de variables
        double person1, person2, person3, person4, person5;
        double total, media;
        // Ingreso de datos por el usuario
        System.out.print("Ingrese la altura de la persona 1: ");
        person1 = datos.nextDouble();
        System.out.print("Ingrese la altura de la persona 2: ");
        person2 = datos.nextDouble();
        System.out.print("Ingrese la altura de la persona 3: ");
        person3 = datos.nextDouble();
        System.out.print("Ingrese la altura de la persona 4: ");
        person4 = datos.nextDouble();
        System.out.print("Ingrese la altura de la persona 5: ");
        person5 = datos.nextDouble();
        // Operaciones
        total = person1+person2+person3+person4+person5;
        media = total/5;
        // Se muestra el resultado
        System.out.print("La estatura media es de: " +media);
    }
    
}
