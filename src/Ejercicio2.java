
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       doctorStrangeZonaOscura();       
    }
    
    public static void doctorStrangeZonaOscura(){
         Scanner teclado=new Scanner(System.in);
         int cont=0;
         char aceptar='n';
         while(aceptar!='s'){
             System.out.println("Doctor Strange: Dormamu Vengo hacer un trato");
             System.out.println("Aceptas mi Condición");   
             aceptar=teclado.nextLine().charAt(0);
             if(aceptar!='s'){
                System.out.println("Doctor Strange Muere");
                cont++;
             }
             if(cont==3){
                 System.out.println("Dormamu: Liberare de este Bucle");
                 System.out.println("Te traje un poco de mi dimension el "
                         + "tiempo");
             }             
         }
         System.out.println("Doctor Strange Vuelve a su Dimensión y"
                 + " libero a dormamu del bucle tiempo");     
    }
    
}
