/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int numA=0;
        int numB=0;
        int suma;
        boolean validoNumA=false;
        boolean validoNumB=false;
        
        //Lectura del primer numero
        do{
            try{
                System.out.print(">Dime numero A: ");
                numA = Integer.parseInt(teclado.nextLine());
                validoNumA=true;
            }    
            catch(Exception e){

                System.out.println("   --EXCEPCION--");
                System.out.println(e);

            }  
           
        }while(validoNumA==false);    
             
        //Lectura del segundo numero
        do{
            try{
                 System.out.print(">Dime numero B: ");
                numB = Integer.parseInt(teclado.nextLine());
                validoNumB=true;
                
            }
            catch(Exception e){

                System.out.println("   --EXCEPCION--");
                System.out.println(e);

            }  
            
        }while(!validoNumB);    
               

        //Si llego aquí, es porque las dos variables las he cogido
        //correctamente
        
        
        suma = numA+numB;
        System.out.println("Suma de A y B: "+suma);
        
        System.out.println(".....");
        
        System.out.println("El programa sigue por aqui");
        
        
    }
    
}
