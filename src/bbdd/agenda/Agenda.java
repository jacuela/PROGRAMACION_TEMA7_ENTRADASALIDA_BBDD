/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbdd.agenda;

import java.util.ArrayList;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Agenda {
    private ArrayList<Contacto> listaContactos;
    
    public Agenda(){
        //Este array list es de apoyo y va a tener en tiempo de ejecución 
        //los contactos a mostrar.  
        //O tenemos todos los contactos o los filtrados por una letra
        listaContactos = new ArrayList();
        
    }
    
    public void insertarContacto(String nombre, String ape, String email){
        Contacto c = new Contacto (nombre,ape,email);
        
        //NO SE HACE ESTO:      listaContactos.add(c);
        
        //## Añadir a la bbdd dicho contacto
        BD_Agenda_MariaDB.insertar(c);
        
    }
    
    public void borrarContacto (int id){
        
        BD_Agenda_MariaDB.borrar(id);
        
        
    }
    
    
    public void listar(){
        
        this.listaContactos = BD_Agenda_MariaDB.getListaCompleta();
        
        System.out.println("======================TODOS=======================");
        for (Contacto c : listaContactos) {
            System.out.println(c);
            
        }
        System.out.println("==================================================");

    }
    
    public void listarPorLetra(char letra){
        
        this.listaContactos = BD_Agenda_MariaDB.getListaPorLetra(letra);
        System.out.println("======================LETRA:"+letra+"=======================");
        for (Contacto c : listaContactos) {
            System.out.println(c);
            
        }
        System.out.println("==================================================");
    }
    
    
    
    
    
    
}
