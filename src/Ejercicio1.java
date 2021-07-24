
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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      contadorNumeros();
    }
    /**funcion para saber cuantos numeros pares e impares digitados**/
    public static void contadorNumeros(){
          int n=1;
        Scanner teclado=new Scanner(System.in);
        int contpar=0;
        int contimp=0;        
        while(n!=-99){                                
            System.out.println("Digite un numero");
            n=teclado.nextInt();
            if(n!=-99){
                if(n%2==0) contpar++;
                else contimp++;
            }            
        }
        System.out.println("numeros digitados de pares fueron "+contpar);
        System.out.println("numeros digitados de impares fueron "+contimp);
    }
    
}
