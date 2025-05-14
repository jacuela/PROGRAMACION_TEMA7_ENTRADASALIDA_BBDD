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
        
        //## Añadir a la bbdd dicho contacto
        
        
        
    }
    
    public void listar(){
        
        
    }
    
    public void listarPorLetra(){
        
        
    }
    
    
    
    
    
    
}
