
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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        calculadora(teclado);
    }
    
    public static void calculadora(Scanner teclado){ 
        double n1,n2,result;
        int op;
        result=0;
        n1=0;
        n2=0;
        do{
            op=mostrarOpcionMenu(teclado);
            if(op!=5){
                System.out.println("Digite n1");
                n1=teclado.nextInt();
                 System.out.println("Digite n2");
                n2=teclado.nextInt();
            }
            switch(op){
                case 1:
                    result=suma(n1, n2);
                break;
                case 2:
                    result=resta(n1, n2);
                break;
                case 3:
                    result=multiplicacion(n1, n2);
                break;
                case 4:
                    result=division(n1, n2);
                break;
                case 5:
                    System.out.println("Adios!!");
                break;
                default:
                    System.out.println("Opcion Invalidad");
                break;
                    
            }
            if(op!=5){
                System.out.println("Resultado "+result);
            }
            
            
        }while(op!=5);        
    }    
    public static int  mostrarOpcionMenu(Scanner teclado){
       
        int op;
        System.out.println("****************************");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.División");
        System.out.println("5.Salir");
        System.out.println("Escoge una Opción");
        op=teclado.nextInt();
        return op;        
    }
    
    public static double suma(double n1,double n2){
        return n1+n2;
    }
    public static double resta(double n1,double n2){
        return n1-n2;
    }
    public static double multiplicacion(double n1,double n2){
        return n1*n2;
    }
    public static double division(double n1,double n2){
        double div=0;
        if(n2!=0){
            div=n1/n2;
        }
        return div;
    }
    
}
