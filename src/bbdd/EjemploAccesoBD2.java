/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bbdd;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class EjemploAccesoBD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        
        
        //***********************************************************
        // CARGAMOS EL DRIVER
        //***********************************************************
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            System.out.println("Driver <org.mariadb.jdbc.Driver> cargado.");
        } catch (Exception ex) {
            System.out.println("Error, no se ha podido cargar MariaDB JDBC Driver");
        }
        
        
        try{
            //***********************************************************
            // NOS CONECTAMOS A LA BASE DE DATOS PERSONAS
            //***********************************************************

            //String url = "jdbc:mysql://127.0.0.1/personas";
            String url = "jdbc:mariadb://127.0.0.1:3306/personas";
            String username = "root";
            String password = "";

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexion a bbdd establecida.");
            
            Statement statement = connection.createStatement();
            
            
            //***********************************************************
            //HACEMOS UN INSERT
            //***********************************************************

            
            //statement.executeUpdate("INSERT INTO personas VALUES (null,'David','Costa',19)");

            String unnombre="Martita";
            String unapellido="Gris";
            int unaedad=20;
 
            String sql=String.format("INSERT INTO personas VALUES (NULL,'%s','%s',%d)",unnombre,unapellido,unaedad);
            // System.out.println("DEP-Sentencia SQL:"+sql);
            
            statement.executeUpdate(sql);

            
            //statement.executeUpdate("INSERT INTO personas VALUES (NULL,'"+unnombre+"','"+unapellido+"',"+unaedad+")");

            
            //***********************************************************
            // HACEMOS UN DELETE
            //***********************************************************
            System.out.print("Nombre de persona a borrar (INTRO para ninguna):");
            String nombreDel=teclado.nextLine();

            if (!nombreDel.equals("")){

                   String sqlDELETE=String.format("DELETE FROM personas WHERE nombre='%s'",nombreDel);
                   
                   
                   int filasBorradas = statement.executeUpdate(sqlDELETE);
                   System.out.println("TOTAL DE FILAS BORRADAS:"+filasBorradas);
            }

            
            
            //***********************************************************
            // HACEMOS UN SELECT
            //***********************************************************
 
            ResultSet rs = statement.executeQuery("SELECT * FROM personas");
            //ResultSet rs = statement.executeQuery("SELECT nombre,apellidos FROM personas");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellidos");
                int edad = rs.getInt("edad");
                System.out.printf("%d, %s %s, %d\n", id, nombre, apellido, edad);
                //System.out.printf(" %s %s\n", nombre, apellido);

            }

            rs.close(); 
            
            
            
            
            
            
            
            
            //================================================================
            //Cerramos cosicas abiertas. Esto se haria despues de hacer cualquier
            //tipo de consulta, SELECT, INSERT O UPDATE o DELETE. En este ejercicio se hacen
            //las varias cosas a la vez para practicar
            statement.close();
            connection.close();    
            
            
        }catch(Exception e){
            System.out.println(e);
        }
            
        
        
    } //fin main
    
}
