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
public class Ficheros1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
        
            BufferedReader br = new BufferedReader(new FileReader("src/ficheros/texto.txt"));

            
            String linea = br.readLine();
            while (linea!=null){
                System.out.println(linea);
                linea = br.readLine();
            }

            br.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
            
        
        
        
        
        
        
    }
    
}
