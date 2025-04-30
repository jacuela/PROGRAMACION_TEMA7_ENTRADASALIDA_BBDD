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
public class Ficheros1_lectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //==========================================
        // Leer un fichero de texto linea a linea
        //==========================================
        
        
        try{
        
            String archivo = "src/ficheros/texto.txt";
            
            BufferedReader br = new BufferedReader(new FileReader(archivo));

            System.out.println("CONTENIDO LINEA A LINEA");
            System.out.println("-----------------------");
            String linea = br.readLine(); //leemos la primera linea
            while (linea!=null){
                System.out.println(linea);
                linea = br.readLine();
            }

            br.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
        
        //==========================================
        // Leer un fichero de texto caracter a caracter
        //==========================================
        try{
        
            BufferedReader br = new BufferedReader(new FileReader("src/ficheros/texto.txt"));

            
            System.out.println("CONTENIDO CARACTER A CARACTER");
            System.out.println("-------------------------------");
            
            int caracter = br.read(); //leemos el primer caracter
            while (caracter != -1){
                System.out.print(caracter);
                System.out.print("-->");
                if (caracter!=10)
                    System.out.println((char)caracter);
                else
                    System.out.println("INTRO");
                caracter = br.read();
            }

            br.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
                
        
        
        
        
        
        
        
        
    }
    
}
