/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbdd.agenda;

import java.sql.*;
import java.util.ArrayList;

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
                
                BD_Agenda_MariaDB.conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                return conexion;
                
                
            } catch (Exception ex) {
                System.out.println(ex);
                return null;
            }
     
            
            
        
    }
    
    public static void cerrarConexion(){
       try {
           BD_Agenda_MariaDB.conexion.close();
       }     
       catch(Exception e){
           System.out.println(e);
       }
        
    }
    
    public static ArrayList<Contacto> getListaCompleta(){
        
        ArrayList<Contacto> lista = new ArrayList();
        
        try{
            //Aqui hago el select * from agenda y devuelvo los datos
            //en un arraylist
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT id, nombre, apellidos, email FROM contactos");

            while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String apellidos = rs.getString("apellidos");
                    String email = rs.getString("email");

                    lista.add(new Contacto(id,nombre,apellidos,email));
            }
            
            rs.close();
            statement.close();

            return lista;
            
        }
        catch(Exception e){
            return null;
            
        }
        
        
        
    } 
    
    
    public static void insertar (Contacto c){
        try{
            Statement statement = conexion.createStatement();
           
            String sql=String.format("INSERT INTO contactos VALUES(null,'%s','%s','%s')",
                    c.getNombre(),c.getApellidos(),c.getEmail());
            //System.out.println("SQL-->"+sql);
            
            statement.executeUpdate(sql);
            statement.close();
            
            
            
        }catch (Exception ex) {
                System.out.println(ex);
                
                
        }
     
        
        
        
    }
    
}
