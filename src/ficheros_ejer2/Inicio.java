/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros_ejer2;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Agenda miAgenda = new Agenda();
        int opcion;
        
        do{
            System.out.println("");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar agenda");
            System.out.println("3. Salir");
            
            System.out.println("");
            System.out.print("Dime una opcion:");
            
            opcion = Integer.parseInt(teclado.nextLine());
            
            switch (opcion){
                case 1: System.out.println("Añadiendo nuevo contacto....");
                    System.out.print("  >Nombre:");
                    String nombre = teclado.nextLine();
                    System.out.print("  >Apellidos:");
                    String apellidos = teclado.nextLine();
                    System.out.print("  >Email:");
                    String email = teclado.nextLine();
                    
                    miAgenda.addContacto(nombre, apellidos, email);
                
                    break;
                case 2:
                    miAgenda.listar();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("  ERROR: opción no válida");
            }
            
        }while (opcion != 3);
        
        
        
        
        
    }
    
}
