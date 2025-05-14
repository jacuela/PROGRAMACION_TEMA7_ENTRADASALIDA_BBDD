/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bbdd.agenda;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Inicio_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int opcionElegida = -1;
        boolean filtrada=false;
        char letra=' ';
        
        //Defino colores con un nombre
        String COLOR_ROJO="\033[31m";
        String COLOR_VERDE="\033[32m";
        String COLOR_NEGRO="\033[30m";
        
        System.out.print("Conectando con base de datos Agenda......");
        if (BD_Agenda_MariaDB.conectar()==null) 
            System.out.println(COLOR_ROJO+"ERROR"+COLOR_NEGRO);
            
        else{
            System.out.println(COLOR_VERDE+"OK"+COLOR_NEGRO);
            
            //Aqui empieza el programa pq hemos conectado a la bbdd con éxito.
            Agenda agenda = new Agenda();
            
            do {
               
                
                System.out.println("");System.out.println("");System.out.println("");
                
                
                if (!filtrada){
                     agenda.listar();
                }
                else{
                    //listo pero filtrado por letra
                }
                
                
                //Muestro el menú
                System.out.println("1. Insertar Contacto");
                System.out.println("2. Borrar Contacto");
                System.out.println("3. Lista completa");
                System.out.println("4. Filtrar por letra comienzo");
                System.out.println("5. Salir");
                

                System.out.print("Escoge Opcion >");
                opcionElegida = Integer.parseInt(teclado.nextLine());

                switch(opcionElegida){

                    case 1:
                        System.out.println("");
                        System.out.print("  Introduce el nombre: ");
                        String nombre = teclado.nextLine();
                        System.out.print("  Introduce los apellidos: ");
                        String apellidos = teclado.nextLine();
                        System.out.print("  Introduce el email: ");
                        String email = teclado.nextLine();
                        System.out.print("  Introduce la fecha de nacimiento:[dd/MM/yyyy]: ");
                        String fecha = teclado.nextLine();

                        break;
                    case 2:
                        System.out.print("Introduce el ID a eliminar: ");
                        int id = Integer.parseInt(teclado.nextLine());
                        break;
                    case 3:
                        break;    
                    case 4:
                        System.out.print("Escoge letra [A-Z]: ");
                        letra=teclado.nextLine().charAt(0);
                        break;
                        
                    case 5:
                        break;
                }
            } while (opcionElegida != 5);
        }
    }
    
}
