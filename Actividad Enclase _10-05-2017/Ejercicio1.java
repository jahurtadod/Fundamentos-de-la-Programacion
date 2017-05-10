/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana6;
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
        Scanner input = new Scanner(System.in);
        
        // Creacion de variables
        int n, op=1, i=1, res=0, x=0;
               
        // Ciclo do...while
        do{
            
            System.out.println("Ingrese un numero");
            n = input.nextInt();
        
            do{
                x=(int)(Math.random()* n);
                System.out.println("Numero: " +x);
            }while(x % 2 != 0);
            
            System.out.println("Numero seleccionado es: " +x);
            System.out.println("Ingrese 0 para terminar / 1 para continuar");
            op = input.nextInt();
            
        }while(op!=0);
    }
    
}
