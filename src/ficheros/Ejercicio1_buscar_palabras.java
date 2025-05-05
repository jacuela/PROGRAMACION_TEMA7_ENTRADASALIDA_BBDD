/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Ejercicio1_buscar_palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        String palabra;
        
        System.out.print("Dime la palabra a buscar [INTRO para fin]: ");
        palabra = teclado.nextLine();
        
        while (!palabra.equals("")){
            int totalPalabras = buscarPalabras(palabra);
            
            System.out.println("Se han encontrado "+totalPalabras+ " palabras.");
            
            System.out.println("");
            System.out.print("Dime la palabra a buscar [INTRO para fin]: ");
            palabra = teclado.nextLine();
        }
        
        
    }
    
    //Funcion buscarPalabras()
    public static int buscarPalabras(String palabra){
        
        int contador=0;
        String linea;
        
        String archivo = "src/ficheros/texto_ejercicio1.txt";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            linea = br.readLine(); //leemos la primera linea
            
            while (linea!=null){
                
                //Elimino caracteres que no quiero
                linea = linea.replace(".", "");
                linea = linea.replace(",","");
            
                //tratamiento de la linea para buscar la palabra
                String []palabrasLinea = linea.split(" "); //obtengo las palabras de la linea
                for (int i = 0; i < palabrasLinea.length; i++) {
                    if (palabrasLinea[i].equals(palabra)){
                        contador++;
                    }
                }
                
                linea = br.readLine(); //leo las sucesivas
                
            }

            br.close();
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        return contador;
        
    }
    
    
    
}
