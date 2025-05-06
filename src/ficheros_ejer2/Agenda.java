/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros_ejer2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Agenda {
    
    private ArrayList<Contacto> lista_contactos;
    private String fichero;
    
    public Agenda(){
        this.lista_contactos = new ArrayList();
        this.fichero = "src/ficheros_ejer2/datos.csv";
        
        //Tengo que cargar todos los datos que hay en el disco,
        //ya que al volver a arrancar el programa, el arraylist
        //esta vacio.
        cargarDatos(this.fichero);
        
        
    }
    
    public void addContacto(String nombre, String apellidos, String email){
        Contacto c = new Contacto(nombre, apellidos, email);
        lista_contactos.add(c);
        
        //Ahora, escribo el contacto en el disco
        escribirEnDisco(c);
        
    }
  
    public void listar(){
        
        
        System.out.println("");
        
        if (!lista_contactos.isEmpty()){
            System.out.println("         AGENDA DE CONTACTOS");
            System.out.println("=========================================");

            for (Contacto c : lista_contactos) {
                System.out.println(c);   //uso el toString
             }

            System.out.println("=========================================");
        }
               

    }
    
    
    //Metodo que escribe en disco el contacto c en el archivo indicado
    private void escribirEnDisco(Contacto c){
        
        
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true));
            
            //Escribo el contacto en formato csv separado por ;
            //nombre;apellidos;email
            bw.write(c.getNombre());
            bw.write(";");
            bw.write(c.getApellidos());
            bw.write(";");
            bw.write(c.getEmail());
            bw.newLine();

            bw.close();
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    private void cargarDatos(String archivo){
        try{
        
            BufferedReader br = new BufferedReader(new FileReader(archivo));
   
            String linea = br.readLine();
            while (linea!=null){
                
                String [] datos = linea.split(";");
                
                Contacto c = new Contacto(datos[0],datos[1],datos[2]);
                this.lista_contactos.add(c); //añado contacto
                
                linea = br.readLine();
            }

            br.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    
    
}
