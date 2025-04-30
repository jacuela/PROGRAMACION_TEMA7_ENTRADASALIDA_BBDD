/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;

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
        
        
        //=======================================
        // Escritura de un fichero de texto 
        //=======================================

        String archivo = "src/ficheros2/texto.txt";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            System.out.println("archivo abierto correctamente");
            
            System.out.println("CONTENIDO LINEA A LINEA");
            System.out.println("-----------------------");
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
        
        
    }
    
}
