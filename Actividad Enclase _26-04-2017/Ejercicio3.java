/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
/**
 *
 * @author jahur
 */
public class Ejercicio3 {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        int i=1, j, total=1, n, k;        
        n=6;
        j=n;
        while(i<=n){
           if(j%2!=0){
               k=1;
               while(k<=j){
                   j=j*k;
                   k++;
               }
           }
            total = total * (i + j);
            // contador
            i++;
            j--;            
        }
        System.out.println("El total es: "+total);
    }
}
