/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_jeffryelvir;
import java.util.Scanner;
/**
 *
 * @author jjea6
 */
public class Lab3P1_JeffryElvir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer= new Scanner(System.in);
        boolean seguir=true;
        while(seguir){
        System.out.println("Menu:");
        System.out.println("1.Ejercicio");
        System.out.println("2.Ejrcicio");
        System.out.println("3.Ejecicio");
            System.out.println("4.Salir");
        int opcion=leer.nextInt();
        switch (opcion){
            case 1:
                double acumulador=0;
                System.out.println("Ingrese la cantidad de puntos");
                int cantidad=leer.nextInt();
                for (int i=1;i<=cantidad;i++){
                    System.out.println("Ingrese el valor de X");
                    int x=leer.nextInt();
                    System.out.println("Ingrese el valor de Y");
                    double y=leer.nextInt();
                    double resta=x-y;
                    double potencia= Math.pow(resta, 2);
                    double repuesta=potencia+acumulador; 
                    acumulador=repuesta;
                    
                }
                double repuestaf=Math.sqrt(acumulador);
                System.out.println("La distancia euclidiana es:"+ repuestaf);
                break;
            case 2:
                System.out.println("Ingrese el tamaño de la pokebola");
                int n=leer.nextInt();
                while(n<0){
                    System.out.println("Ingrese un numero mayor a 0");
                    n=leer.nextInt();
                } 
                int altura=n;
                int ancho=(n*2)-1;
                   int numeral=(ancho/3)+1;// cantdad de # en la fila de arriba n el centro 
                System.out.println(numeral);
                for(int i=1;i<=altura;i++){
                              for(int j=1;j<=ancho;j++){
                              if(i==1){
                                  System.out.print("*");}
                                 else{
                                 if (j==1){
                                  System.out.print("*");}
                                 else{
                                 if (j==ancho){
                                  System.out.print("*");}
                                 else{ 
                                     if(i==altura){
                                   System.out.print("*");
                                  }
                                     else{
                                     if (i<(altura/2)){
                                         System.out.print("*");}
                                     else {
                                         if(j<(ancho/3)+1){
                                             System.out.print("*");
                                         }
                                         else{
                                         if (j>ancho/3 && j<=(ancho/3)+(ancho/3)+1){
                                             System.out.print("#");
                                         }
                                         else{
                                         if(j>=(ancho/3)+(ancho/3)+1) {
                                             System.out.print("*");
                                         }
                                         else {
                                          if(i<(altura/2)+1){
                                              System.out.print("#");
                                          }
                                          else {
                                         System.out.print(" ");
                                     }
                                         }
                                             
                                         }
                                         }
                                             }
                                     
                                     }
                                     
                                 }
                                 }
                                 }
                                  
                              }
                             System.out.println(""); 
                              
                }
                break;
            case 3:
                System.out.println("Ingrese su año de nacimiento");
                int edad=leer.nextInt();
                if (edad<1946){
                    System.out.println("Usted es muy viejo ");
                }
                if (edad>2025){
                    System.out.println("Usted no existe");
                }// fin validacion
                if (edad>=2013 && edad<=2025){
                    System.out.println("Usted es Gen Alpha");
                }
                else {
                if (edad>=1990 && edad<=2012){
                    System.out.println("Usted es Gen Z");
                }
                else { 
                if (edad>=1980 && edad<=1994){
                    System.out.println("Usted es Millenial");
                }
                else {
                if (edad>1975 && edad<=1985){
                    System.out.println("Usted es Xennial");
                }
                else {
                if (edad>1960 && edad<=1979){
                    System.out.println("Usted es Generation X");
                }
                else {
                if (edad>=1946 && edad<=1964){
                    System.out.println("Usted es Baby boomer Gen");
                }
                }
                }

                }
                }

                }
                                  
                                  
                

                
                
               
                
                    
                break;
            case 4:
                seguir=false;
                break;
            default:
                System.out.println("Numero invalido");
                break;
                
        }// Fin de switch hora principal
        }// Fin while principal

// TODO code application logic here
    }
    
}
