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
public class Excepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numA;
        int numB;
        int division;
        
        try{
            System.out.print("Dime numero A: ");
            numA = Integer.parseInt(teclado.nextLine());
        
        
            System.out.print("Dime numero B: ");
            numB = Integer.parseInt(teclado.nextLine());
            
        
            division = numA/numB;
            System.out.println("División: "+division);
            
        }
//        catch (ArithmeticException e){
//            System.out.println("ERROR: excepcion de division por 0");
//        }
//        catch (NumberFormatException e){
//            System.out.println("ERROR: no has introducido un numero");
//        }
        catch(Exception e){
           
            System.out.println("   --EXCEPCION--");
            System.out.println(e);
            
           
            
        }
        
        
        System.out.println("El programa sigue por aqui");
        
        
        
        
        
        
    }
    
}
