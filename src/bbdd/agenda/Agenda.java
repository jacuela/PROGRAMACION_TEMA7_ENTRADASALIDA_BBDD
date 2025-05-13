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
        listaContactos = new ArrayList();
        
    }
    
    public void insertarContacto(String nombre, String ape, String email){
        Contacto c = new Contacto (nombre,ape,email);
        
        //## Añadir a la bbdd dicho contacto
        
        
        
    }
    
    
    
    
    
}
