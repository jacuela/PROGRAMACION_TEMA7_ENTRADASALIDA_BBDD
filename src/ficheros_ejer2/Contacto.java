/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros_ejer2;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Contacto {
    private String nombre;
    private String apellidos;
    private String email;
    
    
    public Contacto(String nombre, String apellidos, String email){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    
    @Override
    public String toString(){
        
        return String.format("%10s %10s - %s", 
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
    
    
    
    
    
}
