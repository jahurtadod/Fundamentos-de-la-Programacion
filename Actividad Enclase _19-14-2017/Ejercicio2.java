/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author jahur
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        
        //Variables
        char departamento;
        
        //Solicitud de datos al usuario
        System.out.print("Ingrese el nombre del departamento: ");
        String opcion = datos.next();
        departamento = opcion.charAt(0);
        
        //switch
        switch(departamento){
            case 'A':
                System.out.println("Departamento de Desarrollo");
                break;
            case 'B':
                System.out.println("Departamento de Recursos Humanos");
                break;
            case 'C':
                System.out.println("Departamento de Finansas");
                break;
            case 'D':
                System.out.println("Departamento de Mercadeo");
                break;
            default :
                System.out.println("Departamento no encontrado");
                break;
        }
    }
    
}
