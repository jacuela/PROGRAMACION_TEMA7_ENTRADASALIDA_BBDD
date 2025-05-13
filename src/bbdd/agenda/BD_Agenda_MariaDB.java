/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbdd.agenda;

import java.sql.*;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class BD_Agenda_MariaDB {

    private static final String URL = "jdbc:mariadb://localhost:3306/agenda";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection conexion;
    
    public static Connection conectar(){
            //***********************************************************
            //    CARGAMOS EL DRIVER
            //***********************************************************
            try {
            
                Class.forName("org.mariadb.jdbc.Driver").newInstance();
            
            } catch (Exception ex) {
                System.out.println("Error, no se ha podido cargar MariaDB JDBC Driver");
            }
        
            
            try {
                //***********************************************************
                //    NOS CONECTAMOS A LA BASE DE DATOS
                //***********************************************************
                
                conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                return conexion;
                
                
            } catch (Exception ex) {
                System.out.println(ex);
                return null;
            }
     
            
        
    }
    
    
    
    
    
}
