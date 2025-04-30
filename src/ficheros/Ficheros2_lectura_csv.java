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
public class Ficheros2_lectura_csv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //==========================================
        // Leer un fichero csv con datos de usuario
        // y extraer dichos datos
        // Cada linea del fichero tiene los campos:
        // nombre;apellido;email
        //==========================================
        
        //MEJORA: indicar antes de mostrar los datos, el total de registros encontrados
        int numRegistros=0;
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/ficheros/usuarios.csv"));
            
            
            String linea = br.readLine();
            while (linea!=null){
                numRegistros++;
                linea = br.readLine();
            }
           
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("TOTAL REGISTROS ENCONTRADOS: "+numRegistros);
        System.out.println("");
        
        try{
        
            BufferedReader br = new BufferedReader(new FileReader("src/ficheros/usuarios.csv"));

            
            String linea = br.readLine();
            while (linea!=null){
                //System.out.println(linea);
                
                
                String [] datos = linea.split(";");
                System.out.println("Nombre:"+datos[0]);
                System.out.println("Apellido:"+datos[1]);
                System.out.println("Email:"+datos[2]);
                System.out.println("-----------------------");
                
                
                linea = br.readLine();
            }

              
            
            br.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
    
}
