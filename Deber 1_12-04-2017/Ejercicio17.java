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
public class Ejercicio17 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se crea la variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
                
        // Creación de variables
        double anguloRadianes;
        double sen, cos, tan;
        double cot, sec, csc;
        
        // Ingreso de datos por el usuario
        System.out.print("Ingrese el tamaño del angulo en radianes: ");
        anguloRadianes= datos.nextDouble();
      
        // Operaciones
        sen = Math.sin(anguloRadianes);
        cos = Math.cos(anguloRadianes);
        tan = sen / cos;
        cot = cos / sen;
        sec = 1 / cos;
        csc = 1 / sen; 
        
        // Se muestra el resultado
        System.out.print("La tangente del angulo es: "+tan+"\n");
        System.out.print("La cotangente del angulo es: "+cot+"\n");
        System.out.print("La secante del angulo es: "+sec+"\n");
        System.out.print("La cosecante del angulo es: "+csc);
            
    }
}
