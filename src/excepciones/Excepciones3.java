package excepciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Excepciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (Util.reintegro_tipo1(2000)){
            System.out.println("Reintegro hecho");
            
        }
        else{
            System.out.println("Algo ha ido mal");   
        }
        
        System.out.println("-----------------------");
        
        
        
        try{
         Util.reintegro_tipo2(2000);   
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
}
