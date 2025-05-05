/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Ficheros3_escritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        //=======================================
        // Escritura de un fichero de texto 
        //=======================================

        String archivo = "src/ficheros/frutas.txt";
        
        try{
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo)); //crea el nuevo fichero de cero
            //BufferedWriter bw = new BufferedWriter(new FileWriter(archivo,true)); //añade si ya existe
            
            bw.write("pera\n");   //el \n equivale a un INTRO (salto de linea)
            bw.write("PLATANO");
            bw.write("amarillo");
            bw.newLine();   //mete una INTRO
            bw.write("limon");
            bw.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        //====================================================================
        // Escritura de palabras recogidas por teclado en un fichero de texto 
        //====================================================================
        
        String archivo2 = "src/ficheros/palabras.txt";
        
        try{
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo2,true)); //crea el nuevo fichero de cero
           
            String palabra;
            System.out.println("Escribe palabras [FIN para parar]:  ");
            do{
                palabra = teclado.nextLine();
                if (!palabra.equalsIgnoreCase("fin")){
                    bw.write(palabra);
                    bw.newLine();
                }
            }while (!palabra.equalsIgnoreCase("fin"));
            
            bw.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
}
