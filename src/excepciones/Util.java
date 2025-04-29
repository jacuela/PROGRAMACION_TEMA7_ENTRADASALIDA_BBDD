/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Util {
    
    public static boolean reintegro_tipo1(int importe){
        //Suponemos que el saldo es de 1000€
        int saldo=1000;
        System.out.println("Saldo:"+saldo);
        if (importe>saldo){
            System.out.println("  >ERROR, saldo insuficiente (SALDO ACTUAL:"+saldo+")");
            return false;
        }
        else{
            saldo=saldo-importe;
            System.out.println("Saldo:"+saldo);
            return true;
        }
        
        
    }
    
    
    public static void reintegro_tipo2(int importe) throws Exception{
        //Suponemos que el saldo es de 1000€
        int saldo=1000;
        System.out.println("Saldo:"+saldo);
        if (importe>saldo){
            throw new Exception(">ERROR, saldo insuficiente (SALDO ACTUAL:"+saldo);
        }
        else{
            saldo=saldo-importe;
            System.out.println("Saldo:"+saldo);
            
        }
        
        
    }
    
    
    
}
