/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbdd.agenda;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Contacto {
    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    
    
    //Este constructor lo usaremos cuando enviemos un nuevo
    //contacto a la bbdd
    public Contacto(String nombre, String apellidos, String email){
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }
    
    //Este constructor lo usaremos cuando leamos un contacto de la bbdd
    public Contacto(int id, String nombre, String apellidos, String email){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }
    
    
    @Override
    public String toString(){
        
        return String.format("[%2d] %10s %10s - %s", 
                this.id,
                this.nombre,
                this.apellidos,
                this.email
                );
    }
    
    
    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
    
}
