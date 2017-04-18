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
public class Ejercicio11 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se crea la variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
                
        // Creación de variables
        double compra_dolares;
        double dolar_pesos;
        double compra_pesos;
        
        // Ingreso de datos por el usuario
        System.out.print("Ingrese el valor de la compra en dolares: ");
        compra_dolares= datos.nextDouble();
        System.out.print("Ingrese el costo de un dolar en pesos: ");
        dolar_pesos = datos.nextDouble();
        
        // Operaciones
        compra_pesos = compra_dolares * dolar_pesos;
               
        // Se muestra el resultado
        System.out.print("La cantidad a pagar en pesos es de: "+compra_pesos);
        
    }
    
}
