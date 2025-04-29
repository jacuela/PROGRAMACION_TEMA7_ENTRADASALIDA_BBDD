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
        
        System.out.print("Dime numero A: ");
        int numA = Integer.parseInt(teclado.nextLine());
        
        System.out.print("Dime numero B: ");
        int numB = Integer.parseInt(teclado.nextLine());
        
        
        int division = numA/numB;
        
        System.out.println("División: "+division);
        
        
    }
    
}
